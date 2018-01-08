public int multi_bit(int a,int b) {
  int res,c;
  res=a;
  c=0;
  while(b>1){
   if(b%2==1){
   c=c+res;
   b=b-1;
   }
  res=res<<1;
  b=b>>1;
  }
return res+c; 
}
