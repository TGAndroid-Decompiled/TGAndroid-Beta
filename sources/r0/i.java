package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f46765a;

    public i(DisplayCutout displayCutout) {
        this.f46765a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f46765a, ((i) obj).f46765a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f46765a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f46765a + "}";
    }
}
