package y1;

import android.text.TextUtils;
import j$.util.Objects;
public class d {
    public final String f49931a;
    public final int f49932b;
    public final int f49933c;

    public d(String str, int i10, int i11) {
        this.f49931a = str;
        this.f49932b = i10;
        this.f49933c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i10 = dVar.f49933c;
        String str = dVar.f49931a;
        int i11 = dVar.f49932b;
        int i12 = this.f49933c;
        String str2 = this.f49931a;
        int i13 = this.f49932b;
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
        return Objects.hash(this.f49931a, Integer.valueOf(this.f49933c));
    }
}
