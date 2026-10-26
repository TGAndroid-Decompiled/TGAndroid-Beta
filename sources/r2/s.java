package r2;

import android.text.TextUtils;
public final class s {
    public final String f47266a;
    public final boolean f47267b;
    public final boolean f47268c;

    public s(String str, boolean z10, boolean z11) {
        this.f47266a = str;
        this.f47267b = z10;
        this.f47268c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f47266a, sVar.f47266a) && this.f47267b == sVar.f47267b && this.f47268c == sVar.f47268c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f7 = a1.g.f(31, 31, this.f47266a);
        int i11 = 1237;
        if (this.f47267b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (f7 + i10) * 31;
        if (this.f47268c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
