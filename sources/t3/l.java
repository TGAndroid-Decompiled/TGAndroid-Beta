package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f57577b;
    public final int f57578c;
    public final int d;
    public final int[] f57579e;
    public final int[] f57580f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f57577b = i7;
        this.f57578c = i10;
        this.d = i11;
        this.f57579e = iArr;
        this.f57580f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f57577b == lVar.f57577b && this.f57578c == lVar.f57578c && this.d == lVar.d && Arrays.equals(this.f57579e, lVar.f57579e) && Arrays.equals(this.f57580f, lVar.f57580f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f57579e);
        return Arrays.hashCode(this.f57580f) + ((hashCode + ((((((527 + this.f57577b) * 31) + this.f57578c) * 31) + this.d) * 31)) * 31);
    }
}
