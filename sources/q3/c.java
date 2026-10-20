package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f44362b;
    public final int f44363c;
    public final int d;
    public final long e;
    public final long f44364f;
    public final i[] f44365g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f44362b = str;
        this.f44363c = i10;
        this.d = i11;
        this.e = j10;
        this.f44364f = j11;
        this.f44365g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44363c == cVar.f44363c && this.d == cVar.d && this.e == cVar.e && this.f44364f == cVar.f44364f && Objects.equals(this.f44362b, cVar.f44362b) && Arrays.equals(this.f44365g, cVar.f44365g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44363c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f44364f)) * 31;
        String str = this.f44362b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
