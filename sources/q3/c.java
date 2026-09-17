package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f44137b;
    public final int f44138c;
    public final int d;
    public final long f44139e;
    public final long f44140f;
    public final j[] f44141g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f44137b = str;
        this.f44138c = i10;
        this.d = i11;
        this.f44139e = j3;
        this.f44140f = j10;
        this.f44141g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44138c == cVar.f44138c && this.d == cVar.d && this.f44139e == cVar.f44139e && this.f44140f == cVar.f44140f && Objects.equals(this.f44137b, cVar.f44137b) && Arrays.equals(this.f44141g, cVar.f44141g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44138c) * 31) + this.d) * 31) + ((int) this.f44139e)) * 31) + ((int) this.f44140f)) * 31;
        String str = this.f44137b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
