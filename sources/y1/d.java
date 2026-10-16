package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f48501a;
    public final int f48502b;
    public final int f48503c;

    public d(String str, int i10, int i11) {
        this.f48501a = str;
        this.f48502b = i10;
        this.f48503c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f48503c;
        String str = dVar.f48501a;
        int i11 = dVar.f48502b;
        int i12 = this.f48503c;
        String str2 = this.f48501a;
        int i13 = this.f48502b;
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
        return Objects.hash(this.f48501a, Integer.valueOf(this.f48503c));
    }
}
