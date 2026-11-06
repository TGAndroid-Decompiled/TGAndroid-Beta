package u2;

import android.text.TextUtils;
public final class s {
    public final String f56215a;
    public final boolean f56216b;
    public final boolean f56217c;

    public s(String str, boolean z9, boolean z10) {
        this.f56215a = str;
        this.f56216b = z9;
        this.f56217c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f56215a, sVar.f56215a) && this.f56216b == sVar.f56216b && this.f56217c == sVar.f56217c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = com.google.android.recaptcha.internal.a.h(31, 31, this.f56215a);
        int i10 = 1237;
        if (this.f56216b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f56217c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
