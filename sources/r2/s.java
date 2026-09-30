package r2;

import android.text.TextUtils;
public final class s {
    public final String f42393a;
    public final boolean f42394b;
    public final boolean f42395c;

    public s(String str, boolean z10, boolean z11) {
        this.f42393a = str;
        this.f42394b = z10;
        this.f42395c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42393a, sVar.f42393a) && this.f42394b == sVar.f42394b && this.f42395c == sVar.f42395c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42393a);
        int i11 = 1237;
        if (this.f42394b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42395c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
