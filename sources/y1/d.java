package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f51738a;
    public final int f51739b;
    public final int f51740c;

    public d(String str, int i10, int i11) {
        this.f51738a = str;
        this.f51739b = i10;
        this.f51740c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f51740c;
        String str = dVar.f51738a;
        int i11 = dVar.f51739b;
        int i12 = this.f51740c;
        String str2 = this.f51738a;
        int i13 = this.f51739b;
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
        return Objects.hash(this.f51738a, Integer.valueOf(this.f51740c));
    }
}
