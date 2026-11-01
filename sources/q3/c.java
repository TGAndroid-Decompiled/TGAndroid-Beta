package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f45437b;
    public final int f45438c;
    public final int d;
    public final long e;
    public final long f45439f;
    public final j[] f45440g;

    public c(String str, int i10, int i11, long j10, long j11, j[] jVarArr) {
        super("CHAP");
        this.f45437b = str;
        this.f45438c = i10;
        this.d = i11;
        this.e = j10;
        this.f45439f = j11;
        this.f45440g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f45438c == cVar.f45438c && this.d == cVar.d && this.e == cVar.e && this.f45439f == cVar.f45439f && Objects.equals(this.f45437b, cVar.f45437b) && Arrays.equals(this.f45440g, cVar.f45440g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f45438c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f45439f)) * 31;
        String str = this.f45437b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
