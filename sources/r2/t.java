package r2;

import android.text.TextUtils;
public final class t {
    public final String f46982a;
    public final boolean f46983b;
    public final boolean f46984c;

    public t(String str, boolean z10, boolean z11) {
        this.f46982a = str;
        this.f46983b = z10;
        this.f46984c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f46982a, tVar.f46982a) && this.f46983b == tVar.f46983b && this.f46984c == tVar.f46984c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(31, 31, this.f46982a);
        int i11 = 1237;
        if (this.f46983b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f46984c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
