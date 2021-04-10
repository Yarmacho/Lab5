public class StackArray<T> extends Stack<T>
{
    private T[] _stack;
    private int  tos;

    public StackArray(int stackSize)
    {
        tos = -1;
        _stack = (T[]) new Object[stackSize];
    }

    @Override
    public T Peek() {
        if (tos == -1)
        {
            throw new IndexOutOfBoundsException("Стек пуст");
        }

        return _stack[tos];
    }

    @Override
    public T Pop() {
        if (tos == -1)
        {
            throw new IndexOutOfBoundsException("Стек пуст");
        }

        return _stack[tos--];
    }

    @Override
    public void Push(T item)
    {
        if (tos >= _stack.length)
        {
            throw new IndexOutOfBoundsException("Стек заполнен");
        }

        _stack[++tos] = item;
    }

    @Override
    public int Count() {
        return tos + 1;
    }

    @Override
    protected T getByIndex(int index) {
        if (index < 0 || index >= _stack.length)
        {
            throw new IndexOutOfBoundsException();
        }
        return _stack[index];
    }
}
