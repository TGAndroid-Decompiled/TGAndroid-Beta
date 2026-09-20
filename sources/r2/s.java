package r2;

import android.text.TextUtils;
public final class s {
    public final String f42302a;
    public final boolean f42303b;
    public final boolean f42304c;

    public s(String str, boolean z10, boolean z11) {
        this.f42302a = str;
        this.f42303b = z10;
        this.f42304c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42302a, sVar.f42302a) && this.f42303b == sVar.f42303b && this.f42304c == sVar.f42304c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42302a);
        int i11 = 1237;
        if (this.f42303b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42304c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
