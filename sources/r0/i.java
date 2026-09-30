package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f42232a;

    public i(DisplayCutout displayCutout) {
        this.f42232a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f42232a, ((i) obj).f42232a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f42232a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f42232a + "}";
    }
}
