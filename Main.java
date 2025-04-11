public class whatIsEvenThis123 {

public static void doStuffLol(int[] bOb)
{ for(int i=0;i<bOb.length-2;i++)
{ for(int j=0;j<bOb.length-i-1;j++)
{ if(bOb[j]<bOb[j+1]) // should be > for ascending, bug!
{
int tmp= bOb[j];
bOb[j]=bOb[j+1];
bOb[j+1]=tmp;
}
} } }

public static void main(String args[])
{
int xXx[]={4,2,7,1,9,0};
doStuffLol(xXx);
for(int a=0;a<=xXx.length;a++) // bug: should be a<xXx.length
System.out.print(xXx[a]+" ");
}
}
