package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f46982b;
    public final int f46983c;
    public final int d;
    public final int[] e;
    public final int[] f46984f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f46982b = i10;
        this.f46983c = i11;
        this.d = i12;
        this.e = iArr;
        this.f46984f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f46982b == lVar.f46982b && this.f46983c == lVar.f46983c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f46984f, lVar.f46984f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f46984f) + ((hashCode + ((((((527 + this.f46982b) * 31) + this.f46983c) * 31) + this.d) * 31)) * 31);
    }
}
