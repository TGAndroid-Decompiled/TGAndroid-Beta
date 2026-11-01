package r2;

import android.text.TextUtils;
public final class s {
    public final String f46294a;
    public final boolean f46295b;
    public final boolean f46296c;

    public s(String str, boolean z10, boolean z11) {
        this.f46294a = str;
        this.f46295b = z10;
        this.f46296c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f46294a, sVar.f46294a) && this.f46295b == sVar.f46295b && this.f46296c == sVar.f46296c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f7 = a1.g.f(31, 31, this.f46294a);
        int i11 = 1237;
        if (this.f46295b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (f7 + i10) * 31;
        if (this.f46296c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
