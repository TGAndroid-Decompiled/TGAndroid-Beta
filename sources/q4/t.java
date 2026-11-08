package q4;

import android.text.TextUtils;
import j$.util.Objects;
public class t {
    public final String f53807a;
    public final int f53808b;
    public final int f53809c;

    public t(String str, int i7, int i10) {
        this.f53807a = str;
        this.f53808b = i7;
        this.f53809c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        int i7 = tVar.f53809c;
        String str = tVar.f53807a;
        int i10 = tVar.f53808b;
        int i11 = this.f53809c;
        String str2 = this.f53807a;
        int i12 = this.f53808b;
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
        return Objects.hash(this.f53807a, Integer.valueOf(this.f53809c));
    }
}
