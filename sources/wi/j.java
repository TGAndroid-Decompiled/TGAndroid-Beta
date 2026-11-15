package wi;

import java.util.Arrays;
public final class j {
    public float f59412a;
    public float[] f59413b;
    public int[] f59414c;
    public boolean d;
    public int[] f59415e;
    public float f59416f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f59415e));
        sb2.append(" aspect=");
        sb2.append(this.f59412a);
        sb2.append(" cost=");
        sb2.append(this.f59416f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f59414c));
        return sb2.toString();
    }
}
