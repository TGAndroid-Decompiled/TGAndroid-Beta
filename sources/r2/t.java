package r2;

import android.text.TextUtils;
public final class t {
    public final String f47062a;
    public final boolean f47063b;
    public final boolean f47064c;

    public t(String str, boolean z10, boolean z11) {
        this.f47062a = str;
        this.f47063b = z10;
        this.f47064c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f47062a, tVar.f47062a) && this.f47063b == tVar.f47063b && this.f47064c == tVar.f47064c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(31, 31, this.f47062a);
        int i11 = 1237;
        if (this.f47063b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f47064c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
