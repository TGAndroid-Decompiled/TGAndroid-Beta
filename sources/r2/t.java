package r2;

import android.text.TextUtils;
public final class t {
    public final String f45781a;
    public final boolean f45782b;
    public final boolean f45783c;

    public t(String str, boolean z10, boolean z11) {
        this.f45781a = str;
        this.f45782b = z10;
        this.f45783c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f45781a, tVar.f45781a) && this.f45782b == tVar.f45782b && this.f45783c == tVar.f45783c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f45781a);
        int i11 = 1237;
        if (this.f45782b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f45783c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
