public interface IStack<T>
{
    T Peek();
    T Pop();
    void Push(T item);
    int Count();

    double GeomAvg() throws Exception;
}
