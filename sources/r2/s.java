package r2;

import android.text.TextUtils;
public final class s {
    public final String f45021a;
    public final boolean f45022b;
    public final boolean f45023c;

    public s(String str, boolean z10, boolean z11) {
        this.f45021a = str;
        this.f45022b = z10;
        this.f45023c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f45021a, sVar.f45021a) && this.f45022b == sVar.f45022b && this.f45023c == sVar.f45023c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(31, 31, this.f45021a);
        int i11 = 1237;
        if (this.f45022b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (g10 + i10) * 31;
        if (this.f45023c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
