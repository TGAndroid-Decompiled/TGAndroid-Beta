package wi;

import java.util.Arrays;
public final class j {
    public float f60018a;
    public float[] f60019b;
    public int[] f60020c;
    public boolean d;
    public int[] f60021e;
    public float f60022f;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        sb2.append(str);
        sb2.append(Arrays.toString(this.f60021e));
        sb2.append(" aspect=");
        sb2.append(this.f60018a);
        sb2.append(" cost=");
        sb2.append(this.f60022f);
        sb2.append(" order=");
        sb2.append(Arrays.toString(this.f60020c));
        return sb2.toString();
    }
}
