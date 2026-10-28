package r2;

import android.text.TextUtils;
public final class s {
    public final String f47301a;
    public final boolean f47302b;
    public final boolean f47303c;

    public s(String str, boolean z10, boolean z11) {
        this.f47301a = str;
        this.f47302b = z10;
        this.f47303c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f47301a, sVar.f47301a) && this.f47302b == sVar.f47302b && this.f47303c == sVar.f47303c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f7 = a1.g.f(31, 31, this.f47301a);
        int i11 = 1237;
        if (this.f47302b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (f7 + i10) * 31;
        if (this.f47303c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
