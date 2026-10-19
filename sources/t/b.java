package t;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import i2.e;
public final class b {
    public static final b f46857b = new b(new int[]{1, 2});
    public final int[] f46858a;

    public b(int[] iArr) {
        this.f46858a = iArr;
    }

    public final void a(CarIcon carIcon) {
        if (carIcon != null && carIcon.getType() == 1) {
            IconCompat icon = carIcon.getIcon();
            if (icon != null) {
                int i10 = icon.i();
                for (int i11 : this.f46858a) {
                    if (i10 == i11) {
                        if (i10 == 4 && !"content".equalsIgnoreCase(icon.j().getScheme())) {
                            throw new IllegalArgumentException("Unsupported URI scheme for: " + icon);
                        }
                        return;
                    }
                }
                throw new IllegalArgumentException(e.j(i10, "Custom icon type is not allowed: "));
            }
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
    }
}
