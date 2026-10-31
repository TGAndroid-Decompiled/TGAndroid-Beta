package r2;

import android.text.TextUtils;
public final class s {
    public final String f46283a;
    public final boolean f46284b;
    public final boolean f46285c;

    public s(String str, boolean z10, boolean z11) {
        this.f46283a = str;
        this.f46284b = z10;
        this.f46285c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f46283a, sVar.f46283a) && this.f46284b == sVar.f46284b && this.f46285c == sVar.f46285c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f7 = a1.g.f(31, 31, this.f46283a);
        int i11 = 1237;
        if (this.f46284b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (f7 + i10) * 31;
        if (this.f46285c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
