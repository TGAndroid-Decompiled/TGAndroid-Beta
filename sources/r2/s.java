package r2;

import android.text.TextUtils;
public final class s {
    public final String f44973a;
    public final boolean f44974b;
    public final boolean f44975c;

    public s(String str, boolean z10, boolean z11) {
        this.f44973a = str;
        this.f44974b = z10;
        this.f44975c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f44973a, sVar.f44973a) && this.f44974b == sVar.f44974b && this.f44975c == sVar.f44975c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(31, 31, this.f44973a);
        int i11 = 1237;
        if (this.f44974b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (g10 + i10) * 31;
        if (this.f44975c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
