package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f55386b;
    public final int f55387c;
    public final int d;
    public final long f55388e;
    public final long f55389f;
    public final i[] f55390g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f55386b = str;
        this.f55387c = i7;
        this.d = i10;
        this.f55388e = j3;
        this.f55389f = j10;
        this.f55390g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f55387c == cVar.f55387c && this.d == cVar.d && this.f55388e == cVar.f55388e && this.f55389f == cVar.f55389f && Objects.equals(this.f55386b, cVar.f55386b) && Arrays.equals(this.f55390g, cVar.f55390g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f55387c) * 31) + this.d) * 31) + ((int) this.f55388e)) * 31) + ((int) this.f55389f)) * 31;
        String str = this.f55386b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
