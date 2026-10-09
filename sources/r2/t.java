package r2;

import android.text.TextUtils;
public final class t {
    public final String f46936a;
    public final boolean f46937b;
    public final boolean f46938c;

    public t(String str, boolean z10, boolean z11) {
        this.f46936a = str;
        this.f46937b = z10;
        this.f46938c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f46936a, tVar.f46936a) && this.f46937b == tVar.f46937b && this.f46938c == tVar.f46938c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(31, 31, this.f46936a);
        int i11 = 1237;
        if (this.f46937b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f46938c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
