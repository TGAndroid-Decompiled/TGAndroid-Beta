package yf;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
public abstract class f0 {
    public static RenderEffect f47143a;

    public static RenderEffect a() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.125f);
        return RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
    }

    public static RenderEffect b() {
        if (f47143a == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            f47143a = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        }
        return f47143a;
    }
}
