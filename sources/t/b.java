package t;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import jg.g;
public final class b {
    public static final b f55355b = new b(new int[]{1, 2});
    public final int[] f55356a;

    public b(int[] iArr) {
        this.f55356a = iArr;
    }

    public final void a(CarIcon carIcon) {
        if (carIcon != null && carIcon.getType() == 1) {
            IconCompat icon = carIcon.getIcon();
            if (icon != null) {
                int i7 = icon.i();
                for (int i10 : this.f55356a) {
                    if (i7 == i10) {
                        if (i7 == 4 && !"content".equalsIgnoreCase(icon.j().getScheme())) {
                            throw new IllegalArgumentException("Unsupported URI scheme for: " + icon);
                        }
                        return;
                    }
                }
                throw new IllegalArgumentException(g.j(i7, "Custom icon type is not allowed: "));
            }
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
    }
}
