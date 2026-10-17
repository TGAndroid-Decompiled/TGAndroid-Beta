package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f44381b;
    public final int f44382c;
    public final int d;
    public final long e;
    public final long f44383f;
    public final i[] f44384g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f44381b = str;
        this.f44382c = i10;
        this.d = i11;
        this.e = j10;
        this.f44383f = j11;
        this.f44384g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44382c == cVar.f44382c && this.d == cVar.d && this.e == cVar.e && this.f44383f == cVar.f44383f && Objects.equals(this.f44381b, cVar.f44381b) && Arrays.equals(this.f44384g, cVar.f44384g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44382c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f44383f)) * 31;
        String str = this.f44381b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
