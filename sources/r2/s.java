package r2;

import android.text.TextUtils;
public final class s {
    public final String f42025a;
    public final boolean f42026b;
    public final boolean f42027c;

    public s(String str, boolean z10, boolean z11) {
        this.f42025a = str;
        this.f42026b = z10;
        this.f42027c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42025a, sVar.f42025a) && this.f42026b == sVar.f42026b && this.f42027c == sVar.f42027c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42025a);
        int i11 = 1237;
        if (this.f42026b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42027c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
