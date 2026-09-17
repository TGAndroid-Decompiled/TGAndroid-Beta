package r2;

import android.text.TextUtils;
public final class s {
    public final String f44874a;
    public final boolean f44875b;
    public final boolean f44876c;

    public s(String str, boolean z10, boolean z11) {
        this.f44874a = str;
        this.f44875b = z10;
        this.f44876c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f44874a, sVar.f44874a) && this.f44875b == sVar.f44875b && this.f44876c == sVar.f44876c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f44874a);
        int i11 = 1237;
        if (this.f44875b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f44876c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
