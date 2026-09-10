package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f41061a;

    public i(DisplayCutout displayCutout) {
        this.f41061a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f41061a, ((i) obj).f41061a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f41061a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f41061a + "}";
    }
}
