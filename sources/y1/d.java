package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f47081a;
    public final int f47082b;
    public final int f47083c;

    public d(String str, int i10, int i11) {
        this.f47081a = str;
        this.f47082b = i10;
        this.f47083c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f47083c;
        String str = dVar.f47081a;
        int i11 = dVar.f47082b;
        int i12 = this.f47083c;
        String str2 = this.f47081a;
        int i13 = this.f47082b;
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
        return Objects.hash(this.f47081a, Integer.valueOf(this.f47083c));
    }
}
