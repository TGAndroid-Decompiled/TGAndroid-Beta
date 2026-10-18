package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f44401b;
    public final int f44402c;
    public final int d;
    public final long e;
    public final long f44403f;
    public final i[] f44404g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f44401b = str;
        this.f44402c = i10;
        this.d = i11;
        this.e = j10;
        this.f44403f = j11;
        this.f44404g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44402c == cVar.f44402c && this.d == cVar.d && this.e == cVar.e && this.f44403f == cVar.f44403f && Objects.equals(this.f44401b, cVar.f44401b) && Arrays.equals(this.f44404g, cVar.f44404g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44402c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f44403f)) * 31;
        String str = this.f44401b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
