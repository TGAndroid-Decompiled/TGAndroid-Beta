package q4;

import android.text.TextUtils;
import j$.util.Objects;
public class t {
    public final String f55870a;
    public final int f55871b;
    public final int f55872c;

    public t(String str, int i7, int i10) {
        this.f55870a = str;
        this.f55871b = i7;
        this.f55872c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        int i7 = tVar.f55872c;
        String str = tVar.f55870a;
        int i10 = tVar.f55871b;
        int i11 = this.f55872c;
        String str2 = this.f55870a;
        int i12 = this.f55871b;
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
        return Objects.hash(this.f55870a, Integer.valueOf(this.f55872c));
    }
}
