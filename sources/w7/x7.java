package w7;

import android.os.Build;
import android.widget.EdgeEffect;
public abstract class x7 {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f7, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.d.c(edgeEffect, f7, f10);
        }
        u0.c.a(edgeEffect, f7, f10);
        return f7;
    }
}
