package r2;

import android.text.TextUtils;
public final class s {
    public final String f42258a;
    public final boolean f42259b;
    public final boolean f42260c;

    public s(String str, boolean z10, boolean z11) {
        this.f42258a = str;
        this.f42259b = z10;
        this.f42260c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42258a, sVar.f42258a) && this.f42259b == sVar.f42259b && this.f42260c == sVar.f42260c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42258a);
        int i11 = 1237;
        if (this.f42259b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42260c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
