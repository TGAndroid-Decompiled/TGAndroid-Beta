package r2;

import android.text.TextUtils;
public final class s {
    public final String f41955a;
    public final boolean f41956b;
    public final boolean f41957c;

    public s(String str, boolean z10, boolean z11) {
        this.f41955a = str;
        this.f41956b = z10;
        this.f41957c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f41955a, sVar.f41955a) && this.f41956b == sVar.f41956b && this.f41957c == sVar.f41957c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f41955a);
        int i11 = 1237;
        if (this.f41956b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f41957c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
