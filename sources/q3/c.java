package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f44366b;
    public final int f44367c;
    public final int d;
    public final long e;
    public final long f44368f;
    public final i[] f44369g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f44366b = str;
        this.f44367c = i10;
        this.d = i11;
        this.e = j10;
        this.f44368f = j11;
        this.f44369g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44367c == cVar.f44367c && this.d == cVar.d && this.e == cVar.e && this.f44368f == cVar.f44368f && Objects.equals(this.f44366b, cVar.f44366b) && Arrays.equals(this.f44369g, cVar.f44369g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44367c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f44368f)) * 31;
        String str = this.f44366b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
