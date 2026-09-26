package r2;

import android.text.TextUtils;
public final class s {
    public final String f42287a;
    public final boolean f42288b;
    public final boolean f42289c;

    public s(String str, boolean z10, boolean z11) {
        this.f42287a = str;
        this.f42288b = z10;
        this.f42289c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42287a, sVar.f42287a) && this.f42288b == sVar.f42288b && this.f42289c == sVar.f42289c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42287a);
        int i11 = 1237;
        if (this.f42288b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42289c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
