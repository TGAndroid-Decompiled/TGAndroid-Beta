package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f41398b;
    public final int f41399c;
    public final int d;
    public final long e;
    public final long f41400f;
    public final j[] f41401g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f41398b = str;
        this.f41399c = i10;
        this.d = i11;
        this.e = j3;
        this.f41400f = j10;
        this.f41401g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f41399c == cVar.f41399c && this.d == cVar.d && this.e == cVar.e && this.f41400f == cVar.f41400f && Objects.equals(this.f41398b, cVar.f41398b) && Arrays.equals(this.f41401g, cVar.f41401g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f41399c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f41400f)) * 31;
        String str = this.f41398b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
