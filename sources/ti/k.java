package ti;

import java.util.Arrays;
public final class k {
    public float f56125a;
    public float[] f56126b;
    public int[] f56127c;
    public boolean d;
    public int[] f56128e;
    public float f56129f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f56128e));
        sb2.append(" aspect=");
        sb2.append(this.f56125a);
        sb2.append(" cost=");
        sb2.append(this.f56129f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f56127c));
        return sb2.toString();
    }
}
