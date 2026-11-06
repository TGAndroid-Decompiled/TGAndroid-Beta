package ti;

import java.util.Arrays;
public final class k {
    public float f56021a;
    public float[] f56022b;
    public int[] f56023c;
    public boolean d;
    public int[] f56024e;
    public float f56025f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f56024e));
        sb2.append(" aspect=");
        sb2.append(this.f56021a);
        sb2.append(" cost=");
        sb2.append(this.f56025f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f56023c));
        return sb2.toString();
    }
}
