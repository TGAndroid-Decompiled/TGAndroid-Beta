package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f41106b;
    public final int f41107c;
    public final int d;
    public final long e;
    public final long f41108f;
    public final j[] f41109g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f41106b = str;
        this.f41107c = i10;
        this.d = i11;
        this.e = j3;
        this.f41108f = j10;
        this.f41109g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f41107c == cVar.f41107c && this.d == cVar.d && this.e == cVar.e && this.f41108f == cVar.f41108f && Objects.equals(this.f41106b, cVar.f41106b) && Arrays.equals(this.f41109g, cVar.f41109g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f41107c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f41108f)) * 31;
        String str = this.f41106b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
