package r2;

import android.text.TextUtils;
public final class s {
    public final String f47160a;
    public final boolean f47161b;
    public final boolean f47162c;

    public s(String str, boolean z10, boolean z11) {
        this.f47160a = str;
        this.f47161b = z10;
        this.f47162c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f47160a, sVar.f47160a) && this.f47161b == sVar.f47161b && this.f47162c == sVar.f47162c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(31, 31, this.f47160a);
        int i11 = 1237;
        if (this.f47161b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f47162c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
