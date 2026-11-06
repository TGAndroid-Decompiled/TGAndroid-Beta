package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f55295b;
    public final int f55296c;
    public final int d;
    public final long f55297e;
    public final long f55298f;
    public final i[] f55299g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f55295b = str;
        this.f55296c = i7;
        this.d = i10;
        this.f55297e = j3;
        this.f55298f = j10;
        this.f55299g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f55296c == cVar.f55296c && this.d == cVar.d && this.f55297e == cVar.f55297e && this.f55298f == cVar.f55298f && Objects.equals(this.f55295b, cVar.f55295b) && Arrays.equals(this.f55299g, cVar.f55299g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f55296c) * 31) + this.d) * 31) + ((int) this.f55297e)) * 31) + ((int) this.f55298f)) * 31;
        String str = this.f55295b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
