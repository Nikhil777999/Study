
public class Date 
{
	private int dd,mm,yy;
	
	public Date() {}
	public Date(int d,int m,int y)
	{
		this.dd=d;
		this.mm=m;
		this.yy=y;
	}
	public int getDd() {
		return this.dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return this.mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return this.yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	public String toString()
	{
		String str = this.dd+"-"+this.mm+"-"+this.yy;
		return str;
	}
}
