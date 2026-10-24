package r2;

import android.text.TextUtils;
public final class s {
    public final String f45398a;
    public final boolean f45399b;
    public final boolean f45400c;

    public s(String str, boolean z10, boolean z11) {
        this.f45398a = str;
        this.f45399b = z10;
        this.f45400c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f45398a, sVar.f45398a) && this.f45399b == sVar.f45399b && this.f45400c == sVar.f45400c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(31, 31, this.f45398a);
        int i11 = 1237;
        if (this.f45399b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (g10 + i10) * 31;
        if (this.f45400c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
