package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f47107a;

    public i(DisplayCutout displayCutout) {
        this.f47107a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f47107a, ((i) obj).f47107a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f47107a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f47107a + "}";
    }
}
