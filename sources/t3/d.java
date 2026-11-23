package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f57605b;
    public final boolean f57606c;
    public final boolean d;
    public final String[] f57607e;
    public final i[] f57608f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f57605b = str;
        this.f57606c = z10;
        this.d = z11;
        this.f57607e = strArr;
        this.f57608f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f57606c == dVar.f57606c && this.d == dVar.d && Objects.equals(this.f57605b, dVar.f57605b) && Arrays.equals(this.f57607e, dVar.f57607e) && Arrays.equals(this.f57608f, dVar.f57608f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f57606c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f57605b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
