package r2;

import android.text.TextUtils;
public final class s {
    public final String f42333a;
    public final boolean f42334b;
    public final boolean f42335c;

    public s(String str, boolean z10, boolean z11) {
        this.f42333a = str;
        this.f42334b = z10;
        this.f42335c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f42333a, sVar.f42333a) && this.f42334b == sVar.f42334b && this.f42335c == sVar.f42335c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(31, 31, this.f42333a);
        int i11 = 1237;
        if (this.f42334b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (h + i10) * 31;
        if (this.f42335c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
