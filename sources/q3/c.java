package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f44778b;
    public final int f44779c;
    public final int d;
    public final long e;
    public final long f44780f;
    public final i[] f44781g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f44778b = str;
        this.f44779c = i10;
        this.d = i11;
        this.e = j10;
        this.f44780f = j11;
        this.f44781g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44779c == cVar.f44779c && this.d == cVar.d && this.e == cVar.e && this.f44780f == cVar.f44780f && Objects.equals(this.f44778b, cVar.f44778b) && Arrays.equals(this.f44781g, cVar.f44781g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44779c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f44780f)) * 31;
        String str = this.f44778b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
