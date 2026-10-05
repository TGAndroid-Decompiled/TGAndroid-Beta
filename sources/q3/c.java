package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f44778b;
    public final int f44779c;
    public final int d;
    public final long f44780e;
    public final long f44781f;
    public final j[] f44782g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f44778b = str;
        this.f44779c = i10;
        this.d = i11;
        this.f44780e = j3;
        this.f44781f = j10;
        this.f44782g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44779c == cVar.f44779c && this.d == cVar.d && this.f44780e == cVar.f44780e && this.f44781f == cVar.f44781f && Objects.equals(this.f44778b, cVar.f44778b) && Arrays.equals(this.f44782g, cVar.f44782g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44779c) * 31) + this.d) * 31) + ((int) this.f44780e)) * 31) + ((int) this.f44781f)) * 31;
        String str = this.f44778b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
