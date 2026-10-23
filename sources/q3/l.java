package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f44796b;
    public final int f44797c;
    public final int d;
    public final int[] e;
    public final int[] f44798f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44796b = i10;
        this.f44797c = i11;
        this.d = i12;
        this.e = iArr;
        this.f44798f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f44796b == lVar.f44796b && this.f44797c == lVar.f44797c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f44798f, lVar.f44798f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f44798f) + ((hashCode + ((((((527 + this.f44796b) * 31) + this.f44797c) * 31) + this.d) * 31)) * 31);
    }
}
