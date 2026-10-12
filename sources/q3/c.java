package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f43270b;
    public final int f43271c;
    public final int d;
    public final long e;
    public final long f43272f;
    public final i[] f43273g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f43270b = str;
        this.f43271c = i10;
        this.d = i11;
        this.e = j10;
        this.f43272f = j11;
        this.f43273g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f43271c == cVar.f43271c && this.d == cVar.d && this.e == cVar.e && this.f43272f == cVar.f43272f && Objects.equals(this.f43270b, cVar.f43270b) && Arrays.equals(this.f43273g, cVar.f43273g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f43271c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f43272f)) * 31;
        String str = this.f43270b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
