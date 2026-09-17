package r2;

import android.text.TextUtils;
public final class s {
    public final String f44902a;
    public final boolean f44903b;
    public final boolean f44904c;

    public s(String str, boolean z10, boolean z11) {
        this.f44902a = str;
        this.f44903b = z10;
        this.f44904c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f44902a, sVar.f44902a) && this.f44903b == sVar.f44903b && this.f44904c == sVar.f44904c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f44902a);
        int i11 = 1237;
        if (this.f44903b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f44904c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
