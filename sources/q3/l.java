package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f44795b;
    public final int f44796c;
    public final int d;
    public final int[] e;
    public final int[] f44797f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44795b = i10;
        this.f44796c = i11;
        this.d = i12;
        this.e = iArr;
        this.f44797f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f44795b == lVar.f44795b && this.f44796c == lVar.f44796c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f44797f, lVar.f44797f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f44797f) + ((hashCode + ((((((527 + this.f44795b) * 31) + this.f44796c) * 31) + this.d) * 31)) * 31);
    }
}
