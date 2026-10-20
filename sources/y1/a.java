package y1;

import android.os.Build;
import android.text.TextUtils;
public final class a {
    public d f49889a;

    public a(String str, int i10, int i11) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    d dVar = new d(str, i10, i11);
                    b.a(i10, i11, str);
                    this.f49889a = dVar;
                    return;
                }
                this.f49889a = new d(str, i10, i11);
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
        return this.f49889a.equals(((a) obj).f49889a);
    }

    public final int hashCode() {
        return this.f49889a.hashCode();
    }
}
