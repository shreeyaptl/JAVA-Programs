class Scannerclass
{
    public static void main(String[] args)
    {
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length: ");
        len = sc.nextInt();
        int a[] = new int[len];
        System.out.print("Enter" + len + "Element to stroe in an array \n");
        for(int i=0;i<len;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements in the array are :\n");
        for(int i = 0;i<len;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}