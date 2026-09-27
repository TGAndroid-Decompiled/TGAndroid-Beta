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
import org.telegram.ui.u3;
public abstract class j0 {
    public static final k2 f47162a = new k2(23);
    public static final k2 f47163b = new k2(24);
    public static Path f47164c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, lp0 lp0Var, u3 u3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = lp0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && lp0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f47164c == null) {
                    f47164c = new Path();
                    d = new Outline();
                    e = new Rect();
                }
                path = f47164c;
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
                u3Var.run(canvas);
                canvas.restoreToCount(save);
                return;
            }
            u3Var.run(canvas);
            return;
        }
        u3Var.run(canvas);
    }
}
