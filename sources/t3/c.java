package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f57557b;
    public final int f57558c;
    public final int d;
    public final long f57559e;
    public final long f57560f;
    public final i[] f57561g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f57557b = str;
        this.f57558c = i7;
        this.d = i10;
        this.f57559e = j3;
        this.f57560f = j10;
        this.f57561g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f57558c == cVar.f57558c && this.d == cVar.d && this.f57559e == cVar.f57559e && this.f57560f == cVar.f57560f && Objects.equals(this.f57557b, cVar.f57557b) && Arrays.equals(this.f57561g, cVar.f57561g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f57558c) * 31) + this.d) * 31) + ((int) this.f57559e)) * 31) + ((int) this.f57560f)) * 31;
        String str = this.f57557b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
