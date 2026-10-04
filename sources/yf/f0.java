package yf;

import ai.k2;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.lp0;
import org.telegram.ui.t3;
public abstract class f0 {
    public static final k2 f50986a = new k2(23);
    public static final k2 f50987b = new k2(24);
    public static Path f50988c;
    public static Outline d;
    public static Rect f50989e;

    public static void a(Canvas canvas, lp0 lp0Var, t3 t3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = lp0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && lp0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f50988c == null) {
                    f50988c = new Path();
                    d = new Outline();
                    f50989e = new Rect();
                }
                path = f50988c;
                outline = d;
                rect = f50989e;
                outline.setEmpty();
                rect.setEmpty();
            } else {
                path = new Path();
                outline = new Outline();
                rect = new Rect();
            }
            Path path2 = path;
            outlineProvider.getOutline(lp0Var, outline);
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
