package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f41433b;
    public final int f41434c;
    public final int d;
    public final long e;
    public final long f41435f;
    public final j[] f41436g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f41433b = str;
        this.f41434c = i10;
        this.d = i11;
        this.e = j3;
        this.f41435f = j10;
        this.f41436g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f41434c == cVar.f41434c && this.d == cVar.d && this.e == cVar.e && this.f41435f == cVar.f41435f && Objects.equals(this.f41433b, cVar.f41433b) && Arrays.equals(this.f41436g, cVar.f41436g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f41434c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f41435f)) * 31;
        String str = this.f41433b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
