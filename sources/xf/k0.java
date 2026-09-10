package xf;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.pp0;
import org.telegram.ui.u3;
public abstract class k0 {
    public static final bi.g f45156a = new bi.g(20);
    public static final bi.g f45157b = new bi.g(21);
    public static Path f45158c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, pp0 pp0Var, u3 u3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = pp0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && pp0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f45158c == null) {
                    f45158c = new Path();
                    d = new Outline();
                    e = new Rect();
                }
                path = f45158c;
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
