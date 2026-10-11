package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f46009b;
    public final int f46010c;
    public final int d;
    public final long f46011e;
    public final long f46012f;
    public final j[] f46013g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f46009b = str;
        this.f46010c = i10;
        this.d = i11;
        this.f46011e = j3;
        this.f46012f = j10;
        this.f46013g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f46010c == cVar.f46010c && this.d == cVar.d && this.f46011e == cVar.f46011e && this.f46012f == cVar.f46012f && Objects.equals(this.f46009b, cVar.f46009b) && Arrays.equals(this.f46013g, cVar.f46013g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f46010c) * 31) + this.d) * 31) + ((int) this.f46011e)) * 31) + ((int) this.f46012f)) * 31;
        String str = this.f46009b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
