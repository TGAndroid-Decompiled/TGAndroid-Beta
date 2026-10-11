package r2;

import android.text.TextUtils;
public final class t {
    public final String f47028a;
    public final boolean f47029b;
    public final boolean f47030c;

    public t(String str, boolean z10, boolean z11) {
        this.f47028a = str;
        this.f47029b = z10;
        this.f47030c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f47028a, tVar.f47028a) && this.f47029b == tVar.f47029b && this.f47030c == tVar.f47030c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(31, 31, this.f47028a);
        int i11 = 1237;
        if (this.f47029b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f47030c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
