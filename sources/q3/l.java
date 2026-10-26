package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f46947b;
    public final int f46948c;
    public final int d;
    public final int[] e;
    public final int[] f46949f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f46947b = i10;
        this.f46948c = i11;
        this.d = i12;
        this.e = iArr;
        this.f46949f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f46947b == lVar.f46947b && this.f46948c == lVar.f46948c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f46949f, lVar.f46949f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f46949f) + ((hashCode + ((((((527 + this.f46947b) * 31) + this.f46948c) * 31) + this.d) * 31)) * 31);
    }
}
