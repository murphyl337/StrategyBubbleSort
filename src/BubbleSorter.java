public class BubbleSorter {
	private int operations = 0;
	private int length = 0;
	private SortHandle sortHandle = null;

	public BubbleSorter(SortHandle handle) {
		sortHandle = handle;
	}

	public int sort(Object array) {
		sortHandle.setArray(array);
		length = sortHandle.length();
		operations = 0;
		if (length <= 1)
			return operations;

		for (int nextToLast = length - 2; nextToLast >= 0; nextToLast--)
			for (int index = 0; index <= nextToLast; index++) {
				if (sortHandle.outOfOrder(index))
					sortHandle.swap(index);
				operations++;
			}

		return operations;
	}
}
