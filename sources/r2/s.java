package r2;

import android.text.TextUtils;
public final class s {
    public final String f44986a;
    public final boolean f44987b;
    public final boolean f44988c;

    public s(String str, boolean z10, boolean z11) {
        this.f44986a = str;
        this.f44987b = z10;
        this.f44988c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f44986a, sVar.f44986a) && this.f44987b == sVar.f44987b && this.f44988c == sVar.f44988c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(31, 31, this.f44986a);
        int i11 = 1237;
        if (this.f44987b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (g10 + i10) * 31;
        if (this.f44988c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
