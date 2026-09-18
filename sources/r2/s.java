package r2;

import android.text.TextUtils;
public final class s {
    public final String f42030a;
    public final boolean f42031b;
    public final boolean f42032c;

    public s(String str, boolean z10, boolean z11) {
        this.f42030a = str;
        this.f42031b = z10;
        this.f42032c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42030a, sVar.f42030a) && this.f42031b == sVar.f42031b && this.f42032c == sVar.f42032c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42030a);
        int i11 = 1237;
        if (this.f42031b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42032c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
