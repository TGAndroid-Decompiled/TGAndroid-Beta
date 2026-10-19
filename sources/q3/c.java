package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f44352b;
    public final int f44353c;
    public final int d;
    public final long e;
    public final long f44354f;
    public final i[] f44355g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f44352b = str;
        this.f44353c = i10;
        this.d = i11;
        this.e = j10;
        this.f44354f = j11;
        this.f44355g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44353c == cVar.f44353c && this.d == cVar.d && this.e == cVar.e && this.f44354f == cVar.f44354f && Objects.equals(this.f44352b, cVar.f44352b) && Arrays.equals(this.f44355g, cVar.f44355g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44353c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f44354f)) * 31;
        String str = this.f44352b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
