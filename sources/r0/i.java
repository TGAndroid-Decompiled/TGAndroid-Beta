package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f46809a;

    public i(DisplayCutout displayCutout) {
        this.f46809a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f46809a, ((i) obj).f46809a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f46809a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f46809a + "}";
    }
}
