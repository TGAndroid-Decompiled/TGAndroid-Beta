package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f45932b;
    public final int f45933c;
    public final int d;
    public final long f45934e;
    public final long f45935f;
    public final j[] f45936g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f45932b = str;
        this.f45933c = i10;
        this.d = i11;
        this.f45934e = j3;
        this.f45935f = j10;
        this.f45936g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f45933c == cVar.f45933c && this.d == cVar.d && this.f45934e == cVar.f45934e && this.f45935f == cVar.f45935f && Objects.equals(this.f45932b, cVar.f45932b) && Arrays.equals(this.f45936g, cVar.f45936g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f45933c) * 31) + this.d) * 31) + ((int) this.f45934e)) * 31) + ((int) this.f45935f)) * 31;
        String str = this.f45932b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
