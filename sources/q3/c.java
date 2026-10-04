package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f44771b;
    public final int f44772c;
    public final int d;
    public final long f44773e;
    public final long f44774f;
    public final j[] f44775g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f44771b = str;
        this.f44772c = i10;
        this.d = i11;
        this.f44773e = j3;
        this.f44774f = j10;
        this.f44775g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44772c == cVar.f44772c && this.d == cVar.d && this.f44773e == cVar.f44773e && this.f44774f == cVar.f44774f && Objects.equals(this.f44771b, cVar.f44771b) && Arrays.equals(this.f44775g, cVar.f44775g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44772c) * 31) + this.d) * 31) + ((int) this.f44773e)) * 31) + ((int) this.f44774f)) * 31;
        String str = this.f44771b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
