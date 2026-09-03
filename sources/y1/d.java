package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f50701a;
    public final int f50702b;
    public final int f50703c;

    public d(String str, int i10, int i11) {
        this.f50701a = str;
        this.f50702b = i10;
        this.f50703c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f50703c;
        String str = dVar.f50701a;
        int i11 = dVar.f50702b;
        int i12 = this.f50703c;
        String str2 = this.f50701a;
        int i13 = this.f50702b;
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
        return Objects.hash(this.f50701a, Integer.valueOf(this.f50703c));
    }
}
