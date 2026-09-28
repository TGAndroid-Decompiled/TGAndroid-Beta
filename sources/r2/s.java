package r2;

import android.text.TextUtils;
public final class s {
    public final String f42288a;
    public final boolean f42289b;
    public final boolean f42290c;

    public s(String str, boolean z10, boolean z11) {
        this.f42288a = str;
        this.f42289b = z10;
        this.f42290c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42288a, sVar.f42288a) && this.f42289b == sVar.f42289b && this.f42290c == sVar.f42290c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42288a);
        int i11 = 1237;
        if (this.f42289b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42290c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
