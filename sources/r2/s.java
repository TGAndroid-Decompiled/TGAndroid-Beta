package r2;

import android.text.TextUtils;
public final class s {
    public final String f42289a;
    public final boolean f42290b;
    public final boolean f42291c;

    public s(String str, boolean z10, boolean z11) {
        this.f42289a = str;
        this.f42290b = z10;
        this.f42291c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42289a, sVar.f42289a) && this.f42290b == sVar.f42290b && this.f42291c == sVar.f42291c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42289a);
        int i11 = 1237;
        if (this.f42290b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42291c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
