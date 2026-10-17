package zf;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import ci.o1;
import org.telegram.ui.v3;
import org.telegram.ui.yo0;
public abstract class i0 {
    public static final o1 f51593a = new o1(23);
    public static final o1 f51594b = new o1(24);
    public static Path f51595c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, yo0 yo0Var, v3 v3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = yo0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && yo0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f51595c == null) {
                    f51595c = new Path();
                    d = new Outline();
                    e = new Rect();
                }
                path = f51595c;
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
            outlineProvider.getOutline(yo0Var, outline);
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
                v3Var.run(canvas);
                canvas.restoreToCount(save);
                return;
            }
            v3Var.run(canvas);
            return;
        }
        v3Var.run(canvas);
    }
}
