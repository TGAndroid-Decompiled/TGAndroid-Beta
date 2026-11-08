package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f55406b;
    public final int f55407c;
    public final int d;
    public final int[] f55408e;
    public final int[] f55409f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f55406b = i7;
        this.f55407c = i10;
        this.d = i11;
        this.f55408e = iArr;
        this.f55409f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f55406b == lVar.f55406b && this.f55407c == lVar.f55407c && this.d == lVar.d && Arrays.equals(this.f55408e, lVar.f55408e) && Arrays.equals(this.f55409f, lVar.f55409f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f55408e);
        return Arrays.hashCode(this.f55409f) + ((hashCode + ((((((527 + this.f55406b) * 31) + this.f55407c) * 31) + this.d) * 31)) * 31);
    }
}
