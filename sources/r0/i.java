package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f44829a;

    public i(DisplayCutout displayCutout) {
        this.f44829a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f44829a, ((i) obj).f44829a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f44829a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f44829a + "}";
    }
}
