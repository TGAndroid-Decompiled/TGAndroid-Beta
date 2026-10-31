package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f45446b;
    public final int f45447c;
    public final int d;
    public final int[] e;
    public final int[] f45448f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f45446b = i10;
        this.f45447c = i11;
        this.d = i12;
        this.e = iArr;
        this.f45448f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f45446b == mVar.f45446b && this.f45447c == mVar.f45447c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f45448f, mVar.f45448f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f45448f) + ((hashCode + ((((((527 + this.f45446b) * 31) + this.f45447c) * 31) + this.d) * 31)) * 31);
    }
}
