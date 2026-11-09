package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f55419b;
    public final int f55420c;
    public final int d;
    public final int[] f55421e;
    public final int[] f55422f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f55419b = i7;
        this.f55420c = i10;
        this.d = i11;
        this.f55421e = iArr;
        this.f55422f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f55419b == lVar.f55419b && this.f55420c == lVar.f55420c && this.d == lVar.d && Arrays.equals(this.f55421e, lVar.f55421e) && Arrays.equals(this.f55422f, lVar.f55422f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f55421e);
        return Arrays.hashCode(this.f55422f) + ((hashCode + ((((((527 + this.f55419b) * 31) + this.f55420c) * 31) + this.d) * 31)) * 31);
    }
}
