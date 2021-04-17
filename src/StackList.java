public class StackList<T>  extends Stack<T>
{
    private Node<T> _topElement;

    @Override
    public T Peek() {
        if (_topElement == null)
        {
            throw new IndexOutOfBoundsException("Стек пуст");
        }

        return _topElement.Value;
    }

    @Override
    public T Pop() {
        if (_topElement == null)
        {
            throw new IndexOutOfBoundsException("Стек пуст");
        }
        var value = _topElement.Value;
        _topElement = _topElement.PreviousNode;
        return value;
    }

    @Override
    public void Push(T item)
    {
        if (_topElement == null)
        {
            _topElement = new Node<>(item);
        }
        else
        {
            var node = new Node<T>(item);
            node.PreviousNode = _topElement;
            _topElement = node;
        }
    }

    @Override
    public int Count() {
        int count = 0;
        for (var tmp = _topElement; tmp != null; tmp = tmp.PreviousNode)
        {
            count++;
        }

        return count;
    }

    @Override
    protected T getByIndex(int index) {
        var count = Count();
        if (index < 0 || index >= count)
        {
            throw new IndexOutOfBoundsException();
        }

        var indexFromLastElement = count - index - 1;
        var node = _topElement;
        for (int i = 0; i < indexFromLastElement; node = node.PreviousNode, i++);

        return node.Value;
    }

    private class Node<T>
    {
        public Node PreviousNode;
        public T Value;

        public Node(T value)
        {
            Value = value;
        }
    }
}
