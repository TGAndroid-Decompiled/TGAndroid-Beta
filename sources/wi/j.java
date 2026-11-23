package wi;

import java.util.Arrays;
public final class j {
    public float f60105a;
    public float[] f60106b;
    public int[] f60107c;
    public boolean d;
    public int[] f60108e;
    public float f60109f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f60108e));
        sb2.append(" aspect=");
        sb2.append(this.f60105a);
        sb2.append(" cost=");
        sb2.append(this.f60109f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f60107c));
        return sb2.toString();
    }
}
