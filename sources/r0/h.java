package r0;

import android.view.DisplayCutout;
import j$.util.Objects;
public final class h {
    public final DisplayCutout f46133a;

    public h(DisplayCutout displayCutout) {
        this.f46133a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            return Objects.equals(this.f46133a, ((h) obj).f46133a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f46133a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f46133a + "}";
    }
}
