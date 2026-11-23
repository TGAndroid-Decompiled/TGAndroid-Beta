package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f57600b;
    public final int f57601c;
    public final int d;
    public final long f57602e;
    public final long f57603f;
    public final i[] f57604g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f57600b = str;
        this.f57601c = i7;
        this.d = i10;
        this.f57602e = j3;
        this.f57603f = j10;
        this.f57604g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f57601c == cVar.f57601c && this.d == cVar.d && this.f57602e == cVar.f57602e && this.f57603f == cVar.f57603f && Objects.equals(this.f57600b, cVar.f57600b) && Arrays.equals(this.f57604g, cVar.f57604g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f57601c) * 31) + this.d) * 31) + ((int) this.f57602e)) * 31) + ((int) this.f57603f)) * 31;
        String str = this.f57600b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
