package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f45457b;
    public final int f45458c;
    public final int d;
    public final int[] e;
    public final int[] f45459f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f45457b = i10;
        this.f45458c = i11;
        this.d = i12;
        this.e = iArr;
        this.f45459f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f45457b == mVar.f45457b && this.f45458c == mVar.f45458c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f45459f, mVar.f45459f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f45459f) + ((hashCode + ((((((527 + this.f45457b) * 31) + this.f45458c) * 31) + this.d) * 31)) * 31);
    }
}
