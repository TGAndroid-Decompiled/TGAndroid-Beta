package ti;

import java.util.Arrays;
public final class k {
    public float f55996a;
    public float[] f55997b;
    public int[] f55998c;
    public boolean d;
    public int[] f55999e;
    public float f56000f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f55999e));
        sb2.append(" aspect=");
        sb2.append(this.f55996a);
        sb2.append(" cost=");
        sb2.append(this.f56000f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f55998c));
        return sb2.toString();
    }
}
