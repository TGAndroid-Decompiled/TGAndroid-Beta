package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f44794b;
    public final int f44795c;
    public final int d;
    public final int[] f44796e;
    public final int[] f44797f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44794b = i10;
        this.f44795c = i11;
        this.d = i12;
        this.f44796e = iArr;
        this.f44797f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f44794b == mVar.f44794b && this.f44795c == mVar.f44795c && this.d == mVar.d && Arrays.equals(this.f44796e, mVar.f44796e) && Arrays.equals(this.f44797f, mVar.f44797f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f44796e);
        return Arrays.hashCode(this.f44797f) + ((hashCode + ((((((527 + this.f44794b) * 31) + this.f44795c) * 31) + this.d) * 31)) * 31);
    }
}
