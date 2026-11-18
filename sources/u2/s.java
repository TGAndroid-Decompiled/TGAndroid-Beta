package u2;

import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class s {
    public final String f58381a;
    public final boolean f58382b;
    public final boolean f58383c;

    public s(String str, boolean z10, boolean z11) {
        this.f58381a = str;
        this.f58382b = z10;
        this.f58383c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f58381a, sVar.f58381a) && this.f58382b == sVar.f58382b && this.f58383c == sVar.f58383c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = e2.h(31, 31, this.f58381a);
        int i10 = 1237;
        if (this.f58382b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (h + i7) * 31;
        if (this.f58383c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
