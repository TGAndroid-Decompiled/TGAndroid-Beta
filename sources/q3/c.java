package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f45879b;
    public final int f45880c;
    public final int d;
    public final long f45881e;
    public final long f45882f;
    public final j[] f45883g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f45879b = str;
        this.f45880c = i10;
        this.d = i11;
        this.f45881e = j3;
        this.f45882f = j10;
        this.f45883g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f45880c == cVar.f45880c && this.d == cVar.d && this.f45881e == cVar.f45881e && this.f45882f == cVar.f45882f && Objects.equals(this.f45879b, cVar.f45879b) && Arrays.equals(this.f45883g, cVar.f45883g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f45880c) * 31) + this.d) * 31) + ((int) this.f45881e)) * 31) + ((int) this.f45882f)) * 31;
        String str = this.f45879b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
