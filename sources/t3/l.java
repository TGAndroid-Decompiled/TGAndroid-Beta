package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f55314b;
    public final int f55315c;
    public final int d;
    public final int[] f55316e;
    public final int[] f55317f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f55314b = i7;
        this.f55315c = i10;
        this.d = i11;
        this.f55316e = iArr;
        this.f55317f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f55314b == lVar.f55314b && this.f55315c == lVar.f55315c && this.d == lVar.d && Arrays.equals(this.f55316e, lVar.f55316e) && Arrays.equals(this.f55317f, lVar.f55317f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f55316e);
        return Arrays.hashCode(this.f55317f) + ((hashCode + ((((((527 + this.f55314b) * 31) + this.f55315c) * 31) + this.d) * 31)) * 31);
    }
}
