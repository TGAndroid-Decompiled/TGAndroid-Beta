package ti;

import java.util.Arrays;
public final class k {
    public float f56124a;
    public float[] f56125b;
    public int[] f56126c;
    public boolean d;
    public int[] f56127e;
    public float f56128f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f56127e));
        sb2.append(" aspect=");
        sb2.append(this.f56124a);
        sb2.append(" cost=");
        sb2.append(this.f56128f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f56126c));
        return sb2.toString();
    }
}
