package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f45934b;
    public final int f45935c;
    public final int d;
    public final long f45936e;
    public final long f45937f;
    public final j[] f45938g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f45934b = str;
        this.f45935c = i10;
        this.d = i11;
        this.f45936e = j3;
        this.f45937f = j10;
        this.f45938g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f45935c == cVar.f45935c && this.d == cVar.d && this.f45936e == cVar.f45936e && this.f45937f == cVar.f45937f && Objects.equals(this.f45934b, cVar.f45934b) && Arrays.equals(this.f45938g, cVar.f45938g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f45935c) * 31) + this.d) * 31) + ((int) this.f45936e)) * 31) + ((int) this.f45937f)) * 31;
        String str = this.f45934b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
