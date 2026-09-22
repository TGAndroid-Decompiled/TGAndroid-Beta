package r2;

import android.text.TextUtils;
public final class s {
    public final String f42323a;
    public final boolean f42324b;
    public final boolean f42325c;

    public s(String str, boolean z10, boolean z11) {
        this.f42323a = str;
        this.f42324b = z10;
        this.f42325c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42323a, sVar.f42323a) && this.f42324b == sVar.f42324b && this.f42325c == sVar.f42325c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42323a);
        int i11 = 1237;
        if (this.f42324b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42325c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
