
public class CharSortHandle implements SortHandle {
	private char[] array = null;

	@Override
	public void swap(int index) {
		char temp = array[index];
		array[index] = array[index+1];
		array[index+1] = temp;
	}

	@Override
	public boolean outOfOrder(int index) {
		return (array[index] > array[index+1]);
	}

	@Override
	public int length() {
		return array.length;
	}

	@Override
	public void setArray(Object array) {
		this.array = (char[])array;
	}
}
