package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f57699b;
    public final int f57700c;
    public final int d;
    public final int[] f57701e;
    public final int[] f57702f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f57699b = i7;
        this.f57700c = i10;
        this.d = i11;
        this.f57701e = iArr;
        this.f57702f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f57699b == lVar.f57699b && this.f57700c == lVar.f57700c && this.d == lVar.d && Arrays.equals(this.f57701e, lVar.f57701e) && Arrays.equals(this.f57702f, lVar.f57702f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f57701e);
        return Arrays.hashCode(this.f57702f) + ((hashCode + ((((((527 + this.f57699b) * 31) + this.f57700c) * 31) + this.d) * 31)) * 31);
    }
}
