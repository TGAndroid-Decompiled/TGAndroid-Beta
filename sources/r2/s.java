package r2;

import android.text.TextUtils;
public final class s {
    public final String f43645a;
    public final boolean f43646b;
    public final boolean f43647c;

    public s(String str, boolean z10, boolean z11) {
        this.f43645a = str;
        this.f43646b = z10;
        this.f43647c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f43645a, sVar.f43645a) && this.f43646b == sVar.f43646b && this.f43647c == sVar.f43647c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(31, 31, this.f43645a);
        int i11 = 1237;
        if (this.f43646b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (g10 + i10) * 31;
        if (this.f43647c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
