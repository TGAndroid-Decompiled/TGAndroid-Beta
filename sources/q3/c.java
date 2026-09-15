package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f41110b;
    public final int f41111c;
    public final int d;
    public final long e;
    public final long f41112f;
    public final j[] f41113g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f41110b = str;
        this.f41111c = i10;
        this.d = i11;
        this.e = j3;
        this.f41112f = j10;
        this.f41113g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f41111c == cVar.f41111c && this.d == cVar.d && this.e == cVar.e && this.f41112f == cVar.f41112f && Objects.equals(this.f41110b, cVar.f41110b) && Arrays.equals(this.f41113g, cVar.f41113g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f41111c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f41112f)) * 31;
        String str = this.f41110b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
