package r2;

import android.text.TextUtils;
public final class t {
    public final String f45774a;
    public final boolean f45775b;
    public final boolean f45776c;

    public t(String str, boolean z10, boolean z11) {
        this.f45774a = str;
        this.f45775b = z10;
        this.f45776c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f45774a, tVar.f45774a) && this.f45775b == tVar.f45775b && this.f45776c == tVar.f45776c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f45774a);
        int i11 = 1237;
        if (this.f45775b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f45776c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
