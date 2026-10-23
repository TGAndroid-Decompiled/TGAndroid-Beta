package zf;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import ci.n1;
import org.telegram.ui.ap0;
import org.telegram.ui.u3;
public abstract class j0 {
    public static final n1 f52047a = new n1(23);
    public static final n1 f52048b = new n1(24);
    public static Path f52049c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, ap0 ap0Var, u3 u3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = ap0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && ap0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f52049c == null) {
                    f52049c = new Path();
                    d = new Outline();
                    e = new Rect();
                }
                path = f52049c;
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
            outlineProvider.getOutline(ap0Var, outline);
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
