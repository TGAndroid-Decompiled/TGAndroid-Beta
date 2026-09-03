package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class j {
    public final DisplayCutout f43141a;

    public j(DisplayCutout displayCutout) {
        this.f43141a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            return Objects.equals(this.f43141a, ((j) obj).f43141a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f43141a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f43141a + "}";
    }
}
