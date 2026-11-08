package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f55407b;
    public final int f55408c;
    public final int d;
    public final int[] f55409e;
    public final int[] f55410f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f55407b = i7;
        this.f55408c = i10;
        this.d = i11;
        this.f55409e = iArr;
        this.f55410f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f55407b == lVar.f55407b && this.f55408c == lVar.f55408c && this.d == lVar.d && Arrays.equals(this.f55409e, lVar.f55409e) && Arrays.equals(this.f55410f, lVar.f55410f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f55409e);
        return Arrays.hashCode(this.f55410f) + ((hashCode + ((((((527 + this.f55407b) * 31) + this.f55408c) * 31) + this.d) * 31)) * 31);
    }
}
