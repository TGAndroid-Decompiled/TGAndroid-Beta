package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41082b;
    public final int f41083c;
    public final int d;
    public final int[] e;
    public final int[] f41084f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41082b = i10;
        this.f41083c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41084f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41082b == mVar.f41082b && this.f41083c == mVar.f41083c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41084f, mVar.f41084f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41084f) + ((hashCode + ((((((527 + this.f41082b) * 31) + this.f41083c) * 31) + this.d) * 31)) * 31);
    }
}
