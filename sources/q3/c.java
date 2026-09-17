package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f41132b;
    public final int f41133c;
    public final int d;
    public final long e;
    public final long f41134f;
    public final j[] f41135g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f41132b = str;
        this.f41133c = i10;
        this.d = i11;
        this.e = j3;
        this.f41134f = j10;
        this.f41135g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f41133c == cVar.f41133c && this.d == cVar.d && this.e == cVar.e && this.f41134f == cVar.f41134f && Objects.equals(this.f41132b, cVar.f41132b) && Arrays.equals(this.f41135g, cVar.f41135g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f41133c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f41134f)) * 31;
        String str = this.f41132b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
