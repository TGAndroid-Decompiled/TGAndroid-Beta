package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f44724a;

    public i(DisplayCutout displayCutout) {
        this.f44724a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f44724a, ((i) obj).f44724a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f44724a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f44724a + "}";
    }
}
