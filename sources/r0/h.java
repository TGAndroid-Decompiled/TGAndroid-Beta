package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class h {
    public final DisplayCutout f56362a;

    public h(DisplayCutout displayCutout) {
        this.f56362a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            return Objects.equals(this.f56362a, ((h) obj).f56362a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f56362a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f56362a + "}";
    }
}
