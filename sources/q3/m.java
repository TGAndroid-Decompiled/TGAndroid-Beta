package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41419b;
    public final int f41420c;
    public final int d;
    public final int[] e;
    public final int[] f41421f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41419b = i10;
        this.f41420c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41421f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41419b == mVar.f41419b && this.f41420c == mVar.f41420c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41421f, mVar.f41421f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41421f) + ((hashCode + ((((((527 + this.f41419b) * 31) + this.f41420c) * 31) + this.d) * 31)) * 31);
    }
}
