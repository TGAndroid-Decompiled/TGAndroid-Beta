package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f46927b;
    public final int f46928c;
    public final int d;
    public final long e;
    public final long f46929f;
    public final i[] f46930g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f46927b = str;
        this.f46928c = i10;
        this.d = i11;
        this.e = j10;
        this.f46929f = j11;
        this.f46930g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f46928c == cVar.f46928c && this.d == cVar.d && this.e == cVar.e && this.f46929f == cVar.f46929f && Objects.equals(this.f46927b, cVar.f46927b) && Arrays.equals(this.f46930g, cVar.f46930g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f46928c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f46929f)) * 31;
        String str = this.f46927b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
