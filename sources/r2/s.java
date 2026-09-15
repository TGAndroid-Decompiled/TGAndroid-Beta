package r2;

import android.text.TextUtils;
public final class s {
    public final String f42003a;
    public final boolean f42004b;
    public final boolean f42005c;

    public s(String str, boolean z10, boolean z11) {
        this.f42003a = str;
        this.f42004b = z10;
        this.f42005c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42003a, sVar.f42003a) && this.f42004b == sVar.f42004b && this.f42005c == sVar.f42005c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42003a);
        int i11 = 1237;
        if (this.f42004b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42005c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
