import java.util.LinkedList;

public class StackList<T>  extends Stack<T>
{
    private LinkedList<T> _stack;

    public StackList()
    {
        _stack = new LinkedList<T>();
    }

    @Override
    public T Peek() {
        if (_stack.isEmpty())
        {
            throw new IndexOutOfBoundsException("Стек пуст");
        }

        return _stack.getLast();
    }

    @Override
    public T Pop() {
        if (_stack.isEmpty())
        {
            throw new IndexOutOfBoundsException("Стек пуст");
        }

        return _stack.pop();
    }

    @Override
    public void Push(T item)
    {
        _stack.addLast(item);
    }

    @Override
    public int Count() {
        return _stack.size();
    }

    @Override
    protected T getByIndex(int index) {
        return _stack.get(index);
    }
}
