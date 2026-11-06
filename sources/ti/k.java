package ti;

import java.util.Arrays;
public final class k {
    public float f56020a;
    public float[] f56021b;
    public int[] f56022c;
    public boolean d;
    public int[] f56023e;
    public float f56024f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f56023e));
        sb2.append(" aspect=");
        sb2.append(this.f56020a);
        sb2.append(" cost=");
        sb2.append(this.f56024f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f56022c));
        return sb2.toString();
    }
}
