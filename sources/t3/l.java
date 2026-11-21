package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f57616b;
    public final int f57617c;
    public final int d;
    public final int[] f57618e;
    public final int[] f57619f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f57616b = i7;
        this.f57617c = i10;
        this.d = i11;
        this.f57618e = iArr;
        this.f57619f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f57616b == lVar.f57616b && this.f57617c == lVar.f57617c && this.d == lVar.d && Arrays.equals(this.f57618e, lVar.f57618e) && Arrays.equals(this.f57619f, lVar.f57619f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f57618e);
        return Arrays.hashCode(this.f57619f) + ((hashCode + ((((((527 + this.f57616b) * 31) + this.f57617c) * 31) + this.d) * 31)) * 31);
    }
}
