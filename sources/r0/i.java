package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f41838a;

    public i(DisplayCutout displayCutout) {
        this.f41838a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f41838a, ((i) obj).f41838a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f41838a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f41838a + "}";
    }
}
