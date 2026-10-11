package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f46043b;
    public final int f46044c;
    public final int d;
    public final long f46045e;
    public final long f46046f;
    public final j[] f46047g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f46043b = str;
        this.f46044c = i10;
        this.d = i11;
        this.f46045e = j3;
        this.f46046f = j10;
        this.f46047g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f46044c == cVar.f46044c && this.d == cVar.d && this.f46045e == cVar.f46045e && this.f46046f == cVar.f46046f && Objects.equals(this.f46043b, cVar.f46043b) && Arrays.equals(this.f46047g, cVar.f46047g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f46044c) * 31) + this.d) * 31) + ((int) this.f46045e)) * 31) + ((int) this.f46046f)) * 31;
        String str = this.f46043b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
