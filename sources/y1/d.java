package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f48502a;
    public final int f48503b;
    public final int f48504c;

    public d(String str, int i10, int i11) {
        this.f48502a = str;
        this.f48503b = i10;
        this.f48504c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f48504c;
        String str = dVar.f48502a;
        int i11 = dVar.f48503b;
        int i12 = this.f48504c;
        String str2 = this.f48502a;
        int i13 = this.f48503b;
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
        return Objects.hash(this.f48502a, Integer.valueOf(this.f48504c));
    }
}
