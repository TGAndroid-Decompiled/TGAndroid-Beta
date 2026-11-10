package q4;

import android.os.Build;
import android.text.TextUtils;
public final class r {
    public t f53817a;

    public r(String str, int i7, int i10) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f53817a = new t(str, i7, i10);
                    return;
                } else {
                    this.f53817a = new t(str, i7, i10);
                    return;
                }
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f53817a.equals(((r) obj).f53817a);
    }

    public final int hashCode() {
        return this.f53817a.hashCode();
    }
}
