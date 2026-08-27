package r0;

import android.view.DisplayCutout;
import j$.util.Objects;

public final class j {

    public final DisplayCutout f46604a;

    public j(DisplayCutout displayCutout) {
        this.f46604a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f46604a, ((j) obj).f46604a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f46604a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f46604a + "}";
    }
}
