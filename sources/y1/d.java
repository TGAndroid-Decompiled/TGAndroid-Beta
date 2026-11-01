package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f54144a;
    public final int f54145b;
    public final int f54146c;

    public d(String str, int i10, int i11) {
        this.f54144a = str;
        this.f54145b = i10;
        this.f54146c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f54146c;
        String str = dVar.f54144a;
        int i11 = dVar.f54145b;
        int i12 = this.f54146c;
        String str2 = this.f54144a;
        int i13 = this.f54145b;
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
        return Objects.hash(this.f54144a, Integer.valueOf(this.f54146c));
    }
}
