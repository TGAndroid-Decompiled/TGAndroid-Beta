package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f55294b;
    public final int f55295c;
    public final int d;
    public final long f55296e;
    public final long f55297f;
    public final i[] f55298g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f55294b = str;
        this.f55295c = i7;
        this.d = i10;
        this.f55296e = j3;
        this.f55297f = j10;
        this.f55298g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f55295c == cVar.f55295c && this.d == cVar.d && this.f55296e == cVar.f55296e && this.f55297f == cVar.f55297f && Objects.equals(this.f55294b, cVar.f55294b) && Arrays.equals(this.f55298g, cVar.f55298g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f55295c) * 31) + this.d) * 31) + ((int) this.f55296e)) * 31) + ((int) this.f55297f)) * 31;
        String str = this.f55294b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
