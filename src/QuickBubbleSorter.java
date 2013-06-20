public class QuickBubbleSorter {
	private int operations = 0;
	private int length = 0;
	private SortHandle sortHandle = null;

	public QuickBubbleSorter(SortHandle handle) {
		sortHandle = handle;
	}

	public int sort(Object array) {
		sortHandle.setArray(array);
		length = sortHandle.length();
		operations = 0;
		if (length <= 1)
			return operations;

		boolean thisPassInOrder = false;
		for (int nextToLast = length - 2; nextToLast >= 0 && !thisPassInOrder; nextToLast--) {
			thisPassInOrder = true;
			for (int index = 0; index < nextToLast; index++) {
				if (sortHandle.outOfOrder(index)) {
					sortHandle.swap(index);
					thisPassInOrder = false;
				}
				operations++;
			}
		}
		return operations;
	}
}
