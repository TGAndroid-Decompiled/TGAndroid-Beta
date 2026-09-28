package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f42128a;

    public i(DisplayCutout displayCutout) {
        this.f42128a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f42128a, ((i) obj).f42128a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f42128a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f42128a + "}";
    }
}
