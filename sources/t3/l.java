package t3;

import java.util.Arrays;
public final class l extends i {
    public final int f57620b;
    public final int f57621c;
    public final int d;
    public final int[] f57622e;
    public final int[] f57623f;

    public l(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f57620b = i7;
        this.f57621c = i10;
        this.d = i11;
        this.f57622e = iArr;
        this.f57623f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f57620b == lVar.f57620b && this.f57621c == lVar.f57621c && this.d == lVar.d && Arrays.equals(this.f57622e, lVar.f57622e) && Arrays.equals(this.f57623f, lVar.f57623f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f57622e);
        return Arrays.hashCode(this.f57623f) + ((hashCode + ((((((527 + this.f57620b) * 31) + this.f57621c) * 31) + this.d) * 31)) * 31);
    }
}
