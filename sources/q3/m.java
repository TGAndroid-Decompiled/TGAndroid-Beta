package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41518b;
    public final int f41519c;
    public final int d;
    public final int[] e;
    public final int[] f41520f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41518b = i10;
        this.f41519c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41520f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41518b == mVar.f41518b && this.f41519c == mVar.f41519c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41520f, mVar.f41520f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41520f) + ((hashCode + ((((((527 + this.f41518b) * 31) + this.f41519c) * 31) + this.d) * 31)) * 31);
    }
}
