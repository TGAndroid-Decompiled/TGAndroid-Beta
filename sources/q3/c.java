package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f45978b;
    public final int f45979c;
    public final int d;
    public final long f45980e;
    public final long f45981f;
    public final j[] f45982g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f45978b = str;
        this.f45979c = i10;
        this.d = i11;
        this.f45980e = j3;
        this.f45981f = j10;
        this.f45982g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f45979c == cVar.f45979c && this.d == cVar.d && this.f45980e == cVar.f45980e && this.f45981f == cVar.f45981f && Objects.equals(this.f45978b, cVar.f45978b) && Arrays.equals(this.f45982g, cVar.f45982g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f45979c) * 31) + this.d) * 31) + ((int) this.f45980e)) * 31) + ((int) this.f45981f)) * 31;
        String str = this.f45978b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
