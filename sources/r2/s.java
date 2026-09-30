package r2;

import android.text.TextUtils;
public final class s {
    public final String f42290a;
    public final boolean f42291b;
    public final boolean f42292c;

    public s(String str, boolean z10, boolean z11) {
        this.f42290a = str;
        this.f42291b = z10;
        this.f42292c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42290a, sVar.f42290a) && this.f42291b == sVar.f42291b && this.f42292c == sVar.f42292c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42290a);
        int i11 = 1237;
        if (this.f42291b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42292c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
