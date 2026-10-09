package r2;

import android.text.TextUtils;
public final class t {
    public final String f46938a;
    public final boolean f46939b;
    public final boolean f46940c;

    public t(String str, boolean z10, boolean z11) {
        this.f46938a = str;
        this.f46939b = z10;
        this.f46940c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f46938a, tVar.f46938a) && this.f46939b == tVar.f46939b && this.f46940c == tVar.f46940c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(31, 31, this.f46938a);
        int i11 = 1237;
        if (this.f46939b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f46940c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
