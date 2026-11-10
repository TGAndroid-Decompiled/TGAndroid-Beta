package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f55398b;
    public final int f55399c;
    public final int d;
    public final long f55400e;
    public final long f55401f;
    public final i[] f55402g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f55398b = str;
        this.f55399c = i7;
        this.d = i10;
        this.f55400e = j3;
        this.f55401f = j10;
        this.f55402g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f55399c == cVar.f55399c && this.d == cVar.d && this.f55400e == cVar.f55400e && this.f55401f == cVar.f55401f && Objects.equals(this.f55398b, cVar.f55398b) && Arrays.equals(this.f55402g, cVar.f55402g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f55399c) * 31) + this.d) * 31) + ((int) this.f55400e)) * 31) + ((int) this.f55401f)) * 31;
        String str = this.f55398b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
