package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f55387b;
    public final int f55388c;
    public final int d;
    public final long f55389e;
    public final long f55390f;
    public final i[] f55391g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f55387b = str;
        this.f55388c = i7;
        this.d = i10;
        this.f55389e = j3;
        this.f55390f = j10;
        this.f55391g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f55388c == cVar.f55388c && this.d == cVar.d && this.f55389e == cVar.f55389e && this.f55390f == cVar.f55390f && Objects.equals(this.f55387b, cVar.f55387b) && Arrays.equals(this.f55391g, cVar.f55391g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f55388c) * 31) + this.d) * 31) + ((int) this.f55389e)) * 31) + ((int) this.f55390f)) * 31;
        String str = this.f55387b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
