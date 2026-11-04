package t;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import k2.p1;
public final class b {
    public static final b f54764b = new b(new int[]{1, 2});
    public final int[] f54765a;

    public b(int[] iArr) {
        this.f54765a = iArr;
    }

    public final void a(CarIcon carIcon) {
        if (carIcon != null && carIcon.getType() == 1) {
            IconCompat icon = carIcon.getIcon();
            if (icon != null) {
                int i3 = icon.i();
                for (int i10 : this.f54765a) {
                    if (i3 == i10) {
                        if (i3 == 4 && !"content".equalsIgnoreCase(icon.j().getScheme())) {
                            throw new IllegalArgumentException("Unsupported URI scheme for: " + icon);
                        }
                        return;
                    }
                }
                throw new IllegalArgumentException(p1.i(i3, "Custom icon type is not allowed: "));
            }
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
    }
}
