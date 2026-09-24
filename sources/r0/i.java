package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f42113a;

    public i(DisplayCutout displayCutout) {
        this.f42113a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f42113a, ((i) obj).f42113a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f42113a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f42113a + "}";
    }
}
