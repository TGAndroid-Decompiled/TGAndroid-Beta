package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f44863a;

    public i(DisplayCutout displayCutout) {
        this.f44863a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f44863a, ((i) obj).f44863a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f44863a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f44863a + "}";
    }
}
