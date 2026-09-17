package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f46274a;
    public final int f46275b;
    public final int f46276c;

    public d(String str, int i10, int i11) {
        this.f46274a = str;
        this.f46275b = i10;
        this.f46276c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f46276c;
        String str = dVar.f46274a;
        int i11 = dVar.f46275b;
        int i12 = this.f46276c;
        String str2 = this.f46274a;
        int i13 = this.f46275b;
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
        return Objects.hash(this.f46274a, Integer.valueOf(this.f46276c));
    }
}
