package ti;

import java.util.Arrays;
public final class k {
    public float f56113a;
    public float[] f56114b;
    public int[] f56115c;
    public boolean d;
    public int[] f56116e;
    public float f56117f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f56116e));
        sb2.append(" aspect=");
        sb2.append(this.f56113a);
        sb2.append(" cost=");
        sb2.append(this.f56117f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f56115c));
        return sb2.toString();
    }
}
