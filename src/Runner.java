public class Runner
{
    public static void main(String[] args) throws Exception {
        IStack<Integer> stack = new StackArray<Integer>(10);

        stack.Push(10);
        stack.Push(20);
        System.out.println(stack.GeomAvg());

        stack = new StackList<>();

        stack.Push(20);
        stack.Push(10);
        stack.Push(30);

        System.out.println(stack.Pop());
        System.out.println(stack.GeomAvg());
    }
}
