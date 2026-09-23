package yf;

import ai.k2;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.jp0;
import org.telegram.ui.t3;
public abstract class i0 {
    public static final k2 f46786a = new k2(21);
    public static final k2 f46787b = new k2(22);
    public static Path f46788c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, jp0 jp0Var, t3 t3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = jp0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && jp0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f46788c == null) {
                    f46788c = new Path();
                    d = new Outline();
                    e = new Rect();
                }
                path = f46788c;
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
            outlineProvider.getOutline(jp0Var, outline);
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
