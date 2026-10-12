package r2;

import android.text.TextUtils;
public final class s {
    public final String f43886a;
    public final boolean f43887b;
    public final boolean f43888c;

    public s(String str, boolean z10, boolean z11) {
        this.f43886a = str;
        this.f43887b = z10;
        this.f43888c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f43886a, sVar.f43886a) && this.f43887b == sVar.f43887b && this.f43888c == sVar.f43888c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(31, 31, this.f43886a);
        int i11 = 1237;
        if (this.f43887b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (g10 + i10) * 31;
        if (this.f43888c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
