package t;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;

public final class b {

    public static final b f47993b = new b(new int[]{1, 2});

    public final int[] f47994a;

    public b(int[] iArr) {
        this.f47994a = iArr;
    }

    public final void a(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        int i10 = icon.i();
        for (int i11 : this.f47994a) {
            if (i10 == i11) {
                if (i10 != 4 || "content".equalsIgnoreCase(icon.j().getScheme())) {
                    return;
                }
                throw new IllegalArgumentException("Unsupported URI scheme for: " + icon);
            }
        }
        throw new IllegalArgumentException(i0.a.k(i10, "Custom icon type is not allowed: "));
    }
}
