package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f41864a;

    public i(DisplayCutout displayCutout) {
        this.f41864a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f41864a, ((i) obj).f41864a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f41864a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f41864a + "}";
    }
}
