package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f51772a;
    public final int f51773b;
    public final int f51774c;

    public d(String str, int i10, int i11) {
        this.f51772a = str;
        this.f51773b = i10;
        this.f51774c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f51774c;
        String str = dVar.f51772a;
        int i11 = dVar.f51773b;
        int i12 = this.f51774c;
        String str2 = this.f51772a;
        int i13 = this.f51773b;
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
        return Objects.hash(this.f51772a, Integer.valueOf(this.f51774c));
    }
}
