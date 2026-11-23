package wi;

import java.util.Arrays;
public final class j {
    public float f59987a;
    public float[] f59988b;
    public int[] f59989c;
    public boolean d;
    public int[] f59990e;
    public float f59991f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f59990e));
        sb2.append(" aspect=");
        sb2.append(this.f59987a);
        sb2.append(" cost=");
        sb2.append(this.f59991f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f59989c));
        return sb2.toString();
    }
}
