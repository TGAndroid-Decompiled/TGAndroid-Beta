package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f57001b;
    public final int f57002c;
    public final int d;
    public final int[] f57003e;
    public final int[] f57004f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f57001b = i7;
        this.f57002c = i10;
        this.d = i11;
        this.f57003e = iArr;
        this.f57004f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f57001b == lVar.f57001b && this.f57002c == lVar.f57002c && this.d == lVar.d && Arrays.equals(this.f57003e, lVar.f57003e) && Arrays.equals(this.f57004f, lVar.f57004f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f57003e);
        return Arrays.hashCode(this.f57004f) + ((hashCode + ((((((527 + this.f57001b) * 31) + this.f57002c) * 31) + this.d) * 31)) * 31);
    }
}
