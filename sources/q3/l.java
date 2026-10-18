package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f44418b;
    public final int f44419c;
    public final int d;
    public final int[] e;
    public final int[] f44420f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44418b = i10;
        this.f44419c = i11;
        this.d = i12;
        this.e = iArr;
        this.f44420f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f44418b == lVar.f44418b && this.f44419c == lVar.f44419c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f44420f, lVar.f44420f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f44420f) + ((hashCode + ((((((527 + this.f44418b) * 31) + this.f44419c) * 31) + this.d) * 31)) * 31);
    }
}
