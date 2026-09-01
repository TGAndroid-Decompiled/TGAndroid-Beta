package y1;

import android.os.Build;
import android.text.TextUtils;
public final class a {
    public d f50664a;

    public a(String str, int i10, int i11) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    d dVar = new d(str, i10, i11);
                    b.a(i10, i11, str);
                    this.f50664a = dVar;
                    return;
                }
                this.f50664a = new d(str, i10, i11);
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
        return this.f50664a.equals(((a) obj).f50664a);
    }

    public final int hashCode() {
        return this.f50664a.hashCode();
    }
}
