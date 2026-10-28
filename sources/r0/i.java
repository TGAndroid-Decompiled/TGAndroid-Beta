package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f47142a;

    public i(DisplayCutout displayCutout) {
        this.f47142a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f47142a, ((i) obj).f47142a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f47142a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f47142a + "}";
    }
}
