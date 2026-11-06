package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f55290b;
    public final int f55291c;
    public final int d;
    public final int[] f55292e;
    public final int[] f55293f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f55290b = i7;
        this.f55291c = i10;
        this.d = i11;
        this.f55292e = iArr;
        this.f55293f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f55290b == lVar.f55290b && this.f55291c == lVar.f55291c && this.d == lVar.d && Arrays.equals(this.f55292e, lVar.f55292e) && Arrays.equals(this.f55293f, lVar.f55293f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f55292e);
        return Arrays.hashCode(this.f55293f) + ((hashCode + ((((((527 + this.f55290b) * 31) + this.f55291c) * 31) + this.d) * 31)) * 31);
    }
}
