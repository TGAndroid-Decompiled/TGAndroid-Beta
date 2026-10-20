package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f49890a;
    public final int f49891b;
    public final int f49892c;

    public d(String str, int i10, int i11) {
        this.f49890a = str;
        this.f49891b = i10;
        this.f49892c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f49892c;
        String str = dVar.f49890a;
        int i11 = dVar.f49891b;
        int i12 = this.f49892c;
        String str2 = this.f49890a;
        int i13 = this.f49891b;
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
        return Objects.hash(this.f49890a, Integer.valueOf(this.f49892c));
    }
}
