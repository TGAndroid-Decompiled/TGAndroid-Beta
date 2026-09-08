package r2;

import android.text.TextUtils;
public final class s {
    public final String f44901a;
    public final boolean f44902b;
    public final boolean f44903c;

    public s(String str, boolean z10, boolean z11) {
        this.f44901a = str;
        this.f44902b = z10;
        this.f44903c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f44901a, sVar.f44901a) && this.f44902b == sVar.f44902b && this.f44903c == sVar.f44903c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f44901a);
        int i11 = 1237;
        if (this.f44902b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f44903c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
