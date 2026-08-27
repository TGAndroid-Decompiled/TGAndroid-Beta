package y1;

import android.os.Build;
import android.text.TextUtils;

public final class a {

    public d f49446a;

    public a(String str, int i10, int i11) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f49446a = new d(str, i10, i11);
            return;
        }
        c cVar = new c(str, i10, i11);
        b.a(i10, i11, str);
        this.f49446a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f49446a.equals(((a) obj).f49446a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49446a.hashCode();
    }
}
