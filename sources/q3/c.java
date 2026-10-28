package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f46965b;
    public final int f46966c;
    public final int d;
    public final long e;
    public final long f46967f;
    public final i[] f46968g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f46965b = str;
        this.f46966c = i10;
        this.d = i11;
        this.e = j10;
        this.f46967f = j11;
        this.f46968g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f46966c == cVar.f46966c && this.d == cVar.d && this.e == cVar.e && this.f46967f == cVar.f46967f && Objects.equals(this.f46965b, cVar.f46965b) && Arrays.equals(this.f46968g, cVar.f46968g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f46966c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f46967f)) * 31;
        String str = this.f46965b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
