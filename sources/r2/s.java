package r2;

import android.text.TextUtils;
public final class s {
    public final String f44873a;
    public final boolean f44874b;
    public final boolean f44875c;

    public s(String str, boolean z10, boolean z11) {
        this.f44873a = str;
        this.f44874b = z10;
        this.f44875c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f44873a, sVar.f44873a) && this.f44874b == sVar.f44874b && this.f44875c == sVar.f44875c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f44873a);
        int i11 = 1237;
        if (this.f44874b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f44875c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
