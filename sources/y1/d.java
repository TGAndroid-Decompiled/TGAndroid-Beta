package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f51651a;
    public final int f51652b;
    public final int f51653c;

    public d(String str, int i10, int i11) {
        this.f51651a = str;
        this.f51652b = i10;
        this.f51653c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f51653c;
        String str = dVar.f51651a;
        int i11 = dVar.f51652b;
        int i12 = this.f51653c;
        String str2 = this.f51651a;
        int i13 = this.f51652b;
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
        return Objects.hash(this.f51651a, Integer.valueOf(this.f51653c));
    }
}
