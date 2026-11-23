package u2;

import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class s {
    public final String f58392a;
    public final boolean f58393b;
    public final boolean f58394c;

    public s(String str, boolean z10, boolean z11) {
        this.f58392a = str;
        this.f58393b = z10;
        this.f58394c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f58392a, sVar.f58392a) && this.f58393b == sVar.f58393b && this.f58394c == sVar.f58394c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = e2.h(31, 31, this.f58392a);
        int i10 = 1237;
        if (this.f58393b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f58394c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
