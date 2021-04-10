public abstract class Stack<T> implements IStack<T>
{
    public double GeomAvg() throws Exception
    {
        var elementsCount = Count();
        if (elementsCount < 2)
        {
            throw new Exception("Для поиска среднего геометрического необходимо хотя бы 2 елемента");
        }
        T val = Peek();
        if (!(val instanceof Number))
        {
            throw new IllegalArgumentException("Стек должен быть числовым!");
        }

        if (elementsCount == 2)
        {
            var firstElem = (Number)getByIndex(0);
            var secondElem = (Number)getByIndex(1);
            return Math.sqrt((firstElem.doubleValue() * secondElem.doubleValue()));
        }
        else
        {
            Number maxElem = (Number)getByIndex(0);
            Number minElem = (Number)getByIndex(0);
            for (int i = 0; i < elementsCount; i++)
            {
                var tmp = (Number)getByIndex(i);
                if (maxElem.doubleValue() < tmp.doubleValue())
                {
                    maxElem = tmp;
                }
                if (minElem.doubleValue() > tmp.doubleValue())
                {
                    minElem = tmp;
                }
            }

            return Math.sqrt(maxElem.doubleValue() * minElem.doubleValue());
        }
    }

    protected abstract T getByIndex(int index);
}
