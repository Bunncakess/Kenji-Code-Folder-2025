
public class SumpUp {
    public static void main(String[] args) throws Exception {


int ans = 0;
for(int i=0; i<20; i=i+3)
  if( i % 2 == 0 )
     ans += i;
System.out.print( ans );
    }
}
