package y1;

import android.os.Build;
import android.text.TextUtils;
public final class a {
    public d f49456a;

    public a(String str, int i9, int i10) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    d dVar = new d(str, i9, i10);
                    b.a(i9, i10, str);
                    this.f49456a = dVar;
                    return;
                }
                this.f49456a = new d(str, i9, i10);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f49456a.equals(((a) obj).f49456a);
    }

    public final int hashCode() {
        return this.f49456a.hashCode();
    }
}
