package p4;

import android.text.TextUtils;
import j$.util.Objects;
public class t {
    public final String f53184a;
    public final int f53185b;
    public final int f53186c;

    public t(String str, int i3, int i10) {
        this.f53184a = str;
        this.f53185b = i3;
        this.f53186c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        int i3 = tVar.f53186c;
        String str = tVar.f53184a;
        int i10 = tVar.f53185b;
        int i11 = this.f53186c;
        String str2 = this.f53184a;
        int i12 = this.f53185b;
        if (i12 >= 0 && i10 >= 0) {
            if (TextUtils.equals(str2, str) && i12 == i10 && i11 == i3) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str2, str) && i11 == i3) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f53184a, Integer.valueOf(this.f53186c));
    }
}
