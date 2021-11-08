//Ruben Nunez
//9.6.20
//velocity problem in OOD

package velocity;

public class VelocitySet {

	private double vi;
	private double vf;

	public VelocitySet() {
		this.vi = 0.0;
		this.vf = 0.0;
	}

	public VelocitySet(double vi, double vf) {
		this.vi = vi;
		this.vf = vf;
	}

	public double getVi() {
		return vi;
	}

	public void setVi(double vi) {
		this.vi = vi;
	}

	public double getVf() {
		return vf;
	}

	public void setVf(double vf) {
		this.vf = vf;
	}

	public String toString() {
		return "VelocitySet [vi=" + vi + ", vf=" + vf + "]";
	}

}//end class
