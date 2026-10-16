package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f43013b;
    public final int f43014c;
    public final int d;
    public final long e;
    public final long f43015f;
    public final i[] f43016g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f43013b = str;
        this.f43014c = i10;
        this.d = i11;
        this.e = j10;
        this.f43015f = j11;
        this.f43016g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f43014c == cVar.f43014c && this.d == cVar.d && this.e == cVar.e && this.f43015f == cVar.f43015f && Objects.equals(this.f43013b, cVar.f43013b) && Arrays.equals(this.f43016g, cVar.f43016g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f43014c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f43015f)) * 31;
        String str = this.f43013b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
