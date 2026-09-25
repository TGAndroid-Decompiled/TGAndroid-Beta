package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f41400b;
    public final int f41401c;
    public final int d;
    public final long e;
    public final long f41402f;
    public final j[] f41403g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f41400b = str;
        this.f41401c = i10;
        this.d = i11;
        this.e = j3;
        this.f41402f = j10;
        this.f41403g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f41401c == cVar.f41401c && this.d == cVar.d && this.e == cVar.e && this.f41402f == cVar.f41402f && Objects.equals(this.f41400b, cVar.f41400b) && Arrays.equals(this.f41403g, cVar.f41403g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f41401c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f41402f)) * 31;
        String str = this.f41400b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
