package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41405b;
    public final int f41406c;
    public final int d;
    public final int[] e;
    public final int[] f41407f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41405b = i10;
        this.f41406c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41407f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41405b == mVar.f41405b && this.f41406c == mVar.f41406c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41407f, mVar.f41407f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41407f) + ((hashCode + ((((((527 + this.f41405b) * 31) + this.f41406c) * 31) + this.d) * 31)) * 31);
    }
}
