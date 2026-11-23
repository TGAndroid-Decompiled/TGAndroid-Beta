package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f57585b;
    public final int f57586c;
    public final int d;
    public final int[] f57587e;
    public final int[] f57588f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f57585b = i7;
        this.f57586c = i10;
        this.d = i11;
        this.f57587e = iArr;
        this.f57588f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f57585b == lVar.f57585b && this.f57586c == lVar.f57586c && this.d == lVar.d && Arrays.equals(this.f57587e, lVar.f57587e) && Arrays.equals(this.f57588f, lVar.f57588f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f57587e);
        return Arrays.hashCode(this.f57588f) + ((hashCode + ((((((527 + this.f57585b) * 31) + this.f57586c) * 31) + this.d) * 31)) * 31);
    }
}
