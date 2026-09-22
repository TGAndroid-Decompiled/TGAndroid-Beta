package r2;

import android.text.TextUtils;
public final class s {
    public final String f41999a;
    public final boolean f42000b;
    public final boolean f42001c;

    public s(String str, boolean z10, boolean z11) {
        this.f41999a = str;
        this.f42000b = z10;
        this.f42001c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f41999a, sVar.f41999a) && this.f42000b == sVar.f42000b && this.f42001c == sVar.f42001c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f41999a);
        int i11 = 1237;
        if (this.f42000b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42001c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
