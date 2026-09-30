package yf;

import ai.k2;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.hp0;
import org.telegram.ui.t3;
public abstract class i0 {
    public static final k2 f47219a = new k2(23);
    public static final k2 f47220b = new k2(24);
    public static Path f47221c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, hp0 hp0Var, t3 t3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = hp0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && hp0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f47221c == null) {
                    f47221c = new Path();
                    d = new Outline();
                    e = new Rect();
                }
                path = f47221c;
                outline = d;
                rect = e;
                outline.setEmpty();
                rect.setEmpty();
            } else {
                path = new Path();
                outline = new Outline();
                rect = new Rect();
            }
            Path path2 = path;
            outlineProvider.getOutline(hp0Var, outline);
            path2.rewind();
            if (!outline.isEmpty() && outline.getRect(rect)) {
                float radius = outline.getRadius();
                if (radius > 0.0f) {
                    path2.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, radius, radius, Path.Direction.CW);
                } else {
                    path2.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
                }
                int save = canvas.save();
                canvas.clipPath(path2);
                t3Var.run(canvas);
                canvas.restoreToCount(save);
                return;
            }
            t3Var.run(canvas);
            return;
        }
        t3Var.run(canvas);
    }
}
