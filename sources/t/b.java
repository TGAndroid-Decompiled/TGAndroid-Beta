package t;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import j7.l1;
public final class b {
    public static final b f48076b = new b(new int[]{1, 2});
    public final int[] f48077a;

    public b(int[] iArr) {
        this.f48077a = iArr;
    }

    public final void a(CarIcon carIcon) {
        if (carIcon != null && carIcon.getType() == 1) {
            IconCompat icon = carIcon.getIcon();
            if (icon != null) {
                int i10 = icon.i();
                for (int i11 : this.f48077a) {
                    if (i10 == i11) {
                        if (i10 == 4 && !"content".equalsIgnoreCase(icon.j().getScheme())) {
                            throw new IllegalArgumentException("Unsupported URI scheme for: " + icon);
                        }
                        return;
                    }
                }
                throw new IllegalArgumentException(l1.k(i10, "Custom icon type is not allowed: "));
            }
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
    }
}
