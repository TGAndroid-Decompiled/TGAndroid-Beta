package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f51883a;
    public final int f51884b;
    public final int f51885c;

    public d(String str, int i10, int i11) {
        this.f51883a = str;
        this.f51884b = i10;
        this.f51885c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f51885c;
        String str = dVar.f51883a;
        int i11 = dVar.f51884b;
        int i12 = this.f51885c;
        String str2 = this.f51883a;
        int i13 = this.f51884b;
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
        return Objects.hash(this.f51883a, Integer.valueOf(this.f51885c));
    }
}
