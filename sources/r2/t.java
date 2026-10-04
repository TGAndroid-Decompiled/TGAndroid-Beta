package r2;

import android.text.TextUtils;
public final class t {
    public final String f45773a;
    public final boolean f45774b;
    public final boolean f45775c;

    public t(String str, boolean z10, boolean z11) {
        this.f45773a = str;
        this.f45774b = z10;
        this.f45775c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f45773a, tVar.f45773a) && this.f45774b == tVar.f45774b && this.f45775c == tVar.f45775c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f45773a);
        int i11 = 1237;
        if (this.f45774b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f45775c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
