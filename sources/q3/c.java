package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f44136b;
    public final int f44137c;
    public final int d;
    public final long f44138e;
    public final long f44139f;
    public final j[] f44140g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f44136b = str;
        this.f44137c = i10;
        this.d = i11;
        this.f44138e = j3;
        this.f44139f = j10;
        this.f44140g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44137c == cVar.f44137c && this.d == cVar.d && this.f44138e == cVar.f44138e && this.f44139f == cVar.f44139f && Objects.equals(this.f44136b, cVar.f44136b) && Arrays.equals(this.f44140g, cVar.f44140g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44137c) * 31) + this.d) * 31) + ((int) this.f44138e)) * 31) + ((int) this.f44139f)) * 31;
        String str = this.f44136b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
