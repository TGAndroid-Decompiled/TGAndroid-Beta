package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f51695a;
    public final int f51696b;
    public final int f51697c;

    public d(String str, int i10, int i11) {
        this.f51695a = str;
        this.f51696b = i10;
        this.f51697c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f51697c;
        String str = dVar.f51695a;
        int i11 = dVar.f51696b;
        int i12 = this.f51697c;
        String str2 = this.f51695a;
        int i13 = this.f51696b;
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
        return Objects.hash(this.f51695a, Integer.valueOf(this.f51697c));
    }
}
