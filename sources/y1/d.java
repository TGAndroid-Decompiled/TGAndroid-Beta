package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f46641a;
    public final int f46642b;
    public final int f46643c;

    public d(String str, int i10, int i11) {
        this.f46641a = str;
        this.f46642b = i10;
        this.f46643c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f46643c;
        String str = dVar.f46641a;
        int i11 = dVar.f46642b;
        int i12 = this.f46643c;
        String str2 = this.f46641a;
        int i13 = this.f46642b;
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
        return Objects.hash(this.f46641a, Integer.valueOf(this.f46643c));
    }
}
