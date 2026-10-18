package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f44358b;
    public final int f44359c;
    public final int d;
    public final long e;
    public final long f44360f;
    public final i[] f44361g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f44358b = str;
        this.f44359c = i10;
        this.d = i11;
        this.e = j10;
        this.f44360f = j11;
        this.f44361g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44359c == cVar.f44359c && this.d == cVar.d && this.e == cVar.e && this.f44360f == cVar.f44360f && Objects.equals(this.f44358b, cVar.f44358b) && Arrays.equals(this.f44361g, cVar.f44361g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44359c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f44360f)) * 31;
        String str = this.f44358b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
