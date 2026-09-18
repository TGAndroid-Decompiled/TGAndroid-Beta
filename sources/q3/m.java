package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41157b;
    public final int f41158c;
    public final int d;
    public final int[] e;
    public final int[] f41159f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41157b = i10;
        this.f41158c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41159f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41157b == mVar.f41157b && this.f41158c == mVar.f41158c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41159f, mVar.f41159f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41159f) + ((hashCode + ((((((527 + this.f41157b) * 31) + this.f41158c) * 31) + this.d) * 31)) * 31);
    }
}
