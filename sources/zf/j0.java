package zf;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import bi.a2;
import org.telegram.ui.v3;
import org.telegram.ui.vp0;
public abstract class j0 {
    public static final a2 f50191a = new a2(23);
    public static final a2 f50192b = new a2(24);
    public static Path f50193c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, vp0 vp0Var, v3 v3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = vp0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && vp0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f50193c == null) {
                    f50193c = new Path();
                    d = new Outline();
                    e = new Rect();
                }
                path = f50193c;
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
            outlineProvider.getOutline(vp0Var, outline);
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
