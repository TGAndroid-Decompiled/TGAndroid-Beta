package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f44779b;
    public final int f44780c;
    public final int d;
    public final long e;
    public final long f44781f;
    public final i[] f44782g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f44779b = str;
        this.f44780c = i10;
        this.d = i11;
        this.e = j10;
        this.f44781f = j11;
        this.f44782g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44780c == cVar.f44780c && this.d == cVar.d && this.e == cVar.e && this.f44781f == cVar.f44781f && Objects.equals(this.f44779b, cVar.f44779b) && Arrays.equals(this.f44782g, cVar.f44782g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44780c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f44781f)) * 31;
        String str = this.f44779b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
