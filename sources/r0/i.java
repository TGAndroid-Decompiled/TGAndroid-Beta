package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class i {
    public final DisplayCutout f45602a;

    public i(DisplayCutout displayCutout) {
        this.f45602a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f45602a, ((i) obj).f45602a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f45602a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f45602a + "}";
    }
}
