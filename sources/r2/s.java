package r2;

import android.text.TextUtils;
public final class s {
    public final String f45001a;
    public final boolean f45002b;
    public final boolean f45003c;

    public s(String str, boolean z10, boolean z11) {
        this.f45001a = str;
        this.f45002b = z10;
        this.f45003c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f45001a, sVar.f45001a) && this.f45002b == sVar.f45002b && this.f45003c == sVar.f45003c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(31, 31, this.f45001a);
        int i11 = 1237;
        if (this.f45002b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (g10 + i10) * 31;
        if (this.f45003c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
