package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f50363a;
    public final int f50364b;
    public final int f50365c;

    public d(String str, int i10, int i11) {
        this.f50363a = str;
        this.f50364b = i10;
        this.f50365c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f50365c;
        String str = dVar.f50363a;
        int i11 = dVar.f50364b;
        int i12 = this.f50365c;
        String str2 = this.f50363a;
        int i13 = this.f50364b;
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
        return Objects.hash(this.f50363a, Integer.valueOf(this.f50365c));
    }
}
