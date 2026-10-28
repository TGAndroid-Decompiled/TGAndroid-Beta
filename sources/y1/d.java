package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f51981a;
    public final int f51982b;
    public final int f51983c;

    public d(String str, int i10, int i11) {
        this.f51981a = str;
        this.f51982b = i10;
        this.f51983c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f51983c;
        String str = dVar.f51981a;
        int i11 = dVar.f51982b;
        int i12 = this.f51983c;
        String str2 = this.f51981a;
        int i13 = this.f51982b;
        if (i13 >= 0 && i11 >= 0) {
            if (TextUtils.equals(str2, str) && i13 == i11 && i12 == i10) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str2, str) && i12 == i10) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f51981a, Integer.valueOf(this.f51983c));
    }
}
