package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f46205a;
    public final int f46206b;
    public final int f46207c;

    public d(String str, int i10, int i11) {
        this.f46205a = str;
        this.f46206b = i10;
        this.f46207c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f46207c;
        String str = dVar.f46205a;
        int i11 = dVar.f46206b;
        int i12 = this.f46207c;
        String str2 = this.f46205a;
        int i13 = this.f46206b;
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
        return Objects.hash(this.f46205a, Integer.valueOf(this.f46207c));
    }
}
