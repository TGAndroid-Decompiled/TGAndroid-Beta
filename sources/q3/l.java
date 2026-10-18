package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f44375b;
    public final int f44376c;
    public final int d;
    public final int[] e;
    public final int[] f44377f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44375b = i10;
        this.f44376c = i11;
        this.d = i12;
        this.e = iArr;
        this.f44377f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f44375b == lVar.f44375b && this.f44376c == lVar.f44376c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f44377f, lVar.f44377f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f44377f) + ((hashCode + ((((((527 + this.f44375b) * 31) + this.f44376c) * 31) + this.d) * 31)) * 31);
    }
}
