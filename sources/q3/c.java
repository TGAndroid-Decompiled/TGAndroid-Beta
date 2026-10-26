package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f46930b;
    public final int f46931c;
    public final int d;
    public final long e;
    public final long f46932f;
    public final i[] f46933g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f46930b = str;
        this.f46931c = i10;
        this.d = i11;
        this.e = j10;
        this.f46932f = j11;
        this.f46933g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f46931c == cVar.f46931c && this.d == cVar.d && this.e == cVar.e && this.f46932f == cVar.f46932f && Objects.equals(this.f46930b, cVar.f46930b) && Arrays.equals(this.f46933g, cVar.f46933g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f46931c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f46932f)) * 31;
        String str = this.f46930b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
