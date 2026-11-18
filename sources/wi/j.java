package wi;

import java.util.Arrays;
public final class j {
    public float f59976a;
    public float[] f59977b;
    public int[] f59978c;
    public boolean d;
    public int[] f59979e;
    public float f59980f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f59979e));
        sb2.append(" aspect=");
        sb2.append(this.f59976a);
        sb2.append(" cost=");
        sb2.append(this.f59980f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f59978c));
        return sb2.toString();
    }
}
