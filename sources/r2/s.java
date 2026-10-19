package r2;

import android.text.TextUtils;
public final class s {
    public final String f44975a;
    public final boolean f44976b;
    public final boolean f44977c;

    public s(String str, boolean z10, boolean z11) {
        this.f44975a = str;
        this.f44976b = z10;
        this.f44977c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f44975a, sVar.f44975a) && this.f44976b == sVar.f44976b && this.f44977c == sVar.f44977c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(31, 31, this.f44975a);
        int i11 = 1237;
        if (this.f44976b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (g10 + i10) * 31;
        if (this.f44977c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
