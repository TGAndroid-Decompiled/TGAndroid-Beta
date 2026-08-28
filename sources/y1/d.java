package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f49457a;
    public final int f49458b;
    public final int f49459c;

    public d(String str, int i9, int i10) {
        this.f49457a = str;
        this.f49458b = i9;
        this.f49459c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i9 = dVar.f49459c;
        String str = dVar.f49457a;
        int i10 = dVar.f49458b;
        int i11 = this.f49459c;
        String str2 = this.f49457a;
        int i12 = this.f49458b;
        if (i12 >= 0 && i10 >= 0) {
            if (TextUtils.equals(str2, str) && i12 == i10 && i11 == i9) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str2, str) && i11 == i9) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f49457a, Integer.valueOf(this.f49459c));
    }
}
