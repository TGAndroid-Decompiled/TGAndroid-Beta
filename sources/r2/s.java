package r2;

import android.text.TextUtils;
public final class s {
    public final String f44987a;
    public final boolean f44988b;
    public final boolean f44989c;

    public s(String str, boolean z10, boolean z11) {
        this.f44987a = str;
        this.f44988b = z10;
        this.f44989c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f44987a, sVar.f44987a) && this.f44988b == sVar.f44988b && this.f44989c == sVar.f44989c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(31, 31, this.f44987a);
        int i11 = 1237;
        if (this.f44988b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (g10 + i10) * 31;
        if (this.f44989c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
