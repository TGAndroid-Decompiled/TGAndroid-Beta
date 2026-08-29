package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class j {
    public final DisplayCutout f46828a;

    public j(DisplayCutout displayCutout) {
        this.f46828a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            return Objects.equals(this.f46828a, ((j) obj).f46828a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f46828a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f46828a + "}";
    }
}
