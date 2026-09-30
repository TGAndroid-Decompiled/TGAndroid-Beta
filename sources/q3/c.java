package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f41498b;
    public final int f41499c;
    public final int d;
    public final long e;
    public final long f41500f;
    public final j[] f41501g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f41498b = str;
        this.f41499c = i10;
        this.d = i11;
        this.e = j3;
        this.f41500f = j10;
        this.f41501g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f41499c == cVar.f41499c && this.d == cVar.d && this.e == cVar.e && this.f41500f == cVar.f41500f && Objects.equals(this.f41498b, cVar.f41498b) && Arrays.equals(this.f41501g, cVar.f41501g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f41499c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f41500f)) * 31;
        String str = this.f41498b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
