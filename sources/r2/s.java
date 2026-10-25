package r2;

import android.text.TextUtils;
public final class s {
    public final String f47263a;
    public final boolean f47264b;
    public final boolean f47265c;

    public s(String str, boolean z10, boolean z11) {
        this.f47263a = str;
        this.f47264b = z10;
        this.f47265c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f47263a, sVar.f47263a) && this.f47264b == sVar.f47264b && this.f47265c == sVar.f47265c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f7 = a1.g.f(31, 31, this.f47263a);
        int i11 = 1237;
        if (this.f47264b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (f7 + i10) * 31;
        if (this.f47265c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
