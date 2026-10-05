package r2;

import android.text.TextUtils;
public final class t {
    public final String f45788a;
    public final boolean f45789b;
    public final boolean f45790c;

    public t(String str, boolean z10, boolean z11) {
        this.f45788a = str;
        this.f45789b = z10;
        this.f45790c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f45788a, tVar.f45788a) && this.f45789b == tVar.f45789b && this.f45790c == tVar.f45790c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f45788a);
        int i11 = 1237;
        if (this.f45789b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f45790c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
