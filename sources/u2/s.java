package u2;

import android.text.TextUtils;
public final class s {
    public final String f56316a;
    public final boolean f56317b;
    public final boolean f56318c;

    public s(String str, boolean z9, boolean z10) {
        this.f56316a = str;
        this.f56317b = z9;
        this.f56318c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f56316a, sVar.f56316a) && this.f56317b == sVar.f56317b && this.f56318c == sVar.f56318c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = com.google.android.recaptcha.internal.a.h(31, 31, this.f56316a);
        int i10 = 1237;
        if (this.f56317b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f56318c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
