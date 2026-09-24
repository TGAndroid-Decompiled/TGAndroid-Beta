package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f41385b;
    public final int f41386c;
    public final int d;
    public final long e;
    public final long f41387f;
    public final j[] f41388g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f41385b = str;
        this.f41386c = i10;
        this.d = i11;
        this.e = j3;
        this.f41387f = j10;
        this.f41388g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f41386c == cVar.f41386c && this.d == cVar.d && this.e == cVar.e && this.f41387f == cVar.f41387f && Objects.equals(this.f41385b, cVar.f41385b) && Arrays.equals(this.f41388g, cVar.f41388g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f41386c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f41387f)) * 31;
        String str = this.f41385b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
