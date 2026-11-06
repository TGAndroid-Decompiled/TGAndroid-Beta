package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f55315b;
    public final int f55316c;
    public final int d;
    public final int[] f55317e;
    public final int[] f55318f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f55315b = i7;
        this.f55316c = i10;
        this.d = i11;
        this.f55317e = iArr;
        this.f55318f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f55315b == lVar.f55315b && this.f55316c == lVar.f55316c && this.d == lVar.d && Arrays.equals(this.f55317e, lVar.f55317e) && Arrays.equals(this.f55318f, lVar.f55318f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f55317e);
        return Arrays.hashCode(this.f55318f) + ((hashCode + ((((((527 + this.f55315b) * 31) + this.f55316c) * 31) + this.d) * 31)) * 31);
    }
}
