package r2;

import android.text.TextUtils;
public final class s {
    public final String f42274a;
    public final boolean f42275b;
    public final boolean f42276c;

    public s(String str, boolean z10, boolean z11) {
        this.f42274a = str;
        this.f42275b = z10;
        this.f42276c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42274a, sVar.f42274a) && this.f42275b == sVar.f42275b && this.f42276c == sVar.f42276c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42274a);
        int i11 = 1237;
        if (this.f42275b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42276c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
