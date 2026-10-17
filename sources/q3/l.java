package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f44398b;
    public final int f44399c;
    public final int d;
    public final int[] e;
    public final int[] f44400f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44398b = i10;
        this.f44399c = i11;
        this.d = i12;
        this.e = iArr;
        this.f44400f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f44398b == lVar.f44398b && this.f44399c == lVar.f44399c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f44400f, lVar.f44400f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f44400f) + ((hashCode + ((((((527 + this.f44398b) * 31) + this.f44399c) * 31) + this.d) * 31)) * 31);
    }
}
