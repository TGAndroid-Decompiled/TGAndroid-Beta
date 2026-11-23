package wi;

import java.util.Arrays;
public final class j {
    public float f60022a;
    public float[] f60023b;
    public int[] f60024c;
    public boolean d;
    public int[] f60025e;
    public float f60026f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f60025e));
        sb2.append(" aspect=");
        sb2.append(this.f60022a);
        sb2.append(" cost=");
        sb2.append(this.f60026f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f60024c));
        return sb2.toString();
    }
}
