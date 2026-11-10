package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f55418b;
    public final int f55419c;
    public final int d;
    public final int[] f55420e;
    public final int[] f55421f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f55418b = i7;
        this.f55419c = i10;
        this.d = i11;
        this.f55420e = iArr;
        this.f55421f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f55418b == lVar.f55418b && this.f55419c == lVar.f55419c && this.d == lVar.d && Arrays.equals(this.f55420e, lVar.f55420e) && Arrays.equals(this.f55421f, lVar.f55421f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f55420e);
        return Arrays.hashCode(this.f55421f) + ((hashCode + ((((((527 + this.f55418b) * 31) + this.f55419c) * 31) + this.d) * 31)) * 31);
    }
}
