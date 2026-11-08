package ti;

import java.util.Arrays;
public final class k {
    public float f56112a;
    public float[] f56113b;
    public int[] f56114c;
    public boolean d;
    public int[] f56115e;
    public float f56116f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f56115e));
        sb2.append(" aspect=");
        sb2.append(this.f56112a);
        sb2.append(" cost=");
        sb2.append(this.f56116f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f56114c));
        return sb2.toString();
    }
}
