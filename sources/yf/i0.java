package yf;

import ai.l2;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.pp0;
import org.telegram.ui.t3;
public abstract class i0 {
    public static final l2 f52215a = new l2(23);
    public static final l2 f52216b = new l2(24);
    public static Path f52217c;
    public static Outline d;
    public static Rect f52218e;

    public static void a(Canvas canvas, pp0 pp0Var, t3 t3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = pp0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && pp0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f52217c == null) {
                    f52217c = new Path();
                    d = new Outline();
                    f52218e = new Rect();
                }
                path = f52217c;
                outline = d;
                rect = f52218e;
                outline.setEmpty();
                rect.setEmpty();
            } else {
                path = new Path();
                outline = new Outline();
                rect = new Rect();
            }
            Path path2 = path;
            outlineProvider.getOutline(pp0Var, outline);
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
