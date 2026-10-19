package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f44354b;
    public final int f44355c;
    public final int d;
    public final long e;
    public final long f44356f;
    public final i[] f44357g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f44354b = str;
        this.f44355c = i10;
        this.d = i11;
        this.e = j10;
        this.f44356f = j11;
        this.f44357g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44355c == cVar.f44355c && this.d == cVar.d && this.e == cVar.e && this.f44356f == cVar.f44356f && Objects.equals(this.f44354b, cVar.f44354b) && Arrays.equals(this.f44357g, cVar.f44357g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44355c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f44356f)) * 31;
        String str = this.f44354b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
