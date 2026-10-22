package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f44382b;
    public final int f44383c;
    public final int d;
    public final int[] e;
    public final int[] f44384f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44382b = i10;
        this.f44383c = i11;
        this.d = i12;
        this.e = iArr;
        this.f44384f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f44382b == lVar.f44382b && this.f44383c == lVar.f44383c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f44384f, lVar.f44384f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f44384f) + ((hashCode + ((((((527 + this.f44382b) * 31) + this.f44383c) * 31) + this.d) * 31)) * 31);
    }
}
