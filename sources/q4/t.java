package q4;

import android.text.TextUtils;
import j$.util.Objects;
public class t {
    public final String f53806a;
    public final int f53807b;
    public final int f53808c;

    public t(String str, int i7, int i10) {
        this.f53806a = str;
        this.f53807b = i7;
        this.f53808c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        int i7 = tVar.f53808c;
        String str = tVar.f53806a;
        int i10 = tVar.f53807b;
        int i11 = this.f53808c;
        String str2 = this.f53806a;
        int i12 = this.f53807b;
        if (i12 >= 0 && i10 >= 0) {
            if (TextUtils.equals(str2, str) && i12 == i10 && i11 == i7) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str2, str) && i11 == i7) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f53806a, Integer.valueOf(this.f53808c));
    }
}
