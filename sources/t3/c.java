package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f56981b;
    public final int f56982c;
    public final int d;
    public final long f56983e;
    public final long f56984f;
    public final i[] f56985g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f56981b = str;
        this.f56982c = i7;
        this.d = i10;
        this.f56983e = j3;
        this.f56984f = j10;
        this.f56985g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f56982c == cVar.f56982c && this.d == cVar.d && this.f56983e == cVar.f56983e && this.f56984f == cVar.f56984f && Objects.equals(this.f56981b, cVar.f56981b) && Arrays.equals(this.f56985g, cVar.f56985g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f56982c) * 31) + this.d) * 31) + ((int) this.f56983e)) * 31) + ((int) this.f56984f)) * 31;
        String str = this.f56981b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
