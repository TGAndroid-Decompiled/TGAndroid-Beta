package zf;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
public abstract class g0 {
    public static RenderEffect f50179a;

    public static RenderEffect a() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.125f);
        return RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
    }

    public static RenderEffect b() {
        if (f50179a == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            f50179a = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        }
        return f50179a;
    }
}
