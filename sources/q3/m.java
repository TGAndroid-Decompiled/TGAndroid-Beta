package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41130b;
    public final int f41131c;
    public final int d;
    public final int[] e;
    public final int[] f41132f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41130b = i10;
        this.f41131c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41132f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41130b == mVar.f41130b && this.f41131c == mVar.f41131c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41132f, mVar.f41132f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41132f) + ((hashCode + ((((((527 + this.f41130b) * 31) + this.f41131c) * 31) + this.d) * 31)) * 31);
    }
}
