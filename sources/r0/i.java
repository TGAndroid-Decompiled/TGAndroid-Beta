package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f45241a;

    public i(DisplayCutout displayCutout) {
        this.f45241a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f45241a, ((i) obj).f45241a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f45241a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f45241a + "}";
    }
}
