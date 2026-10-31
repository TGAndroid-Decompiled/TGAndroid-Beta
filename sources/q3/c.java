package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f45426b;
    public final int f45427c;
    public final int d;
    public final long e;
    public final long f45428f;
    public final j[] f45429g;

    public c(String str, int i10, int i11, long j10, long j11, j[] jVarArr) {
        super("CHAP");
        this.f45426b = str;
        this.f45427c = i10;
        this.d = i11;
        this.e = j10;
        this.f45428f = j11;
        this.f45429g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f45427c == cVar.f45427c && this.d == cVar.d && this.e == cVar.e && this.f45428f == cVar.f45428f && Objects.equals(this.f45426b, cVar.f45426b) && Arrays.equals(this.f45429g, cVar.f45429g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f45427c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f45428f)) * 31;
        String str = this.f45426b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
