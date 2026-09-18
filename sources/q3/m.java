package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41391b;
    public final int f41392c;
    public final int d;
    public final int[] e;
    public final int[] f41393f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41391b = i10;
        this.f41392c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41393f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41391b == mVar.f41391b && this.f41392c == mVar.f41392c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41393f, mVar.f41393f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41393f) + ((hashCode + ((((((527 + this.f41391b) * 31) + this.f41392c) * 31) + this.d) * 31)) * 31);
    }
}
