package wi;

import java.util.Arrays;
public final class j {
    public float f59977a;
    public float[] f59978b;
    public int[] f59979c;
    public boolean d;
    public int[] f59980e;
    public float f59981f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f59980e));
        sb2.append(" aspect=");
        sb2.append(this.f59977a);
        sb2.append(" cost=");
        sb2.append(this.f59981f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f59979c));
        return sb2.toString();
    }
}
