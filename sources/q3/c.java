package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f41429b;
    public final int f41430c;
    public final int d;
    public final long e;
    public final long f41431f;
    public final j[] f41432g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f41429b = str;
        this.f41430c = i10;
        this.d = i11;
        this.e = j3;
        this.f41431f = j10;
        this.f41432g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f41430c == cVar.f41430c && this.d == cVar.d && this.e == cVar.e && this.f41431f == cVar.f41431f && Objects.equals(this.f41429b, cVar.f41429b) && Arrays.equals(this.f41432g, cVar.f41432g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f41430c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f41431f)) * 31;
        String str = this.f41429b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
