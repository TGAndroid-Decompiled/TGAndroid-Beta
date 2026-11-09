package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f55399b;
    public final int f55400c;
    public final int d;
    public final long f55401e;
    public final long f55402f;
    public final i[] f55403g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f55399b = str;
        this.f55400c = i7;
        this.d = i10;
        this.f55401e = j3;
        this.f55402f = j10;
        this.f55403g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f55400c == cVar.f55400c && this.d == cVar.d && this.f55401e == cVar.f55401e && this.f55402f == cVar.f55402f && Objects.equals(this.f55399b, cVar.f55399b) && Arrays.equals(this.f55403g, cVar.f55403g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f55400c) * 31) + this.d) * 31) + ((int) this.f55401e)) * 31) + ((int) this.f55402f)) * 31;
        String str = this.f55399b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
