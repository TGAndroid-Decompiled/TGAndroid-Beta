package rf;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import bi.d2;
import org.telegram.ui.gn0;
import org.telegram.ui.s3;
public abstract class e0 {
    public static final d2 f46537a = new d2(22);
    public static final d2 f46538b = new d2(23);
    public static Path f46539c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, gn0 gn0Var, s3 s3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = gn0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && gn0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f46539c == null) {
                    f46539c = new Path();
                    d = new Outline();
                    e = new Rect();
                }
                path = f46539c;
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
            outlineProvider.getOutline(gn0Var, outline);
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
                s3Var.a(canvas);
                canvas.restoreToCount(save);
                return;
            }
            s3Var.a(canvas);
            return;
        }
        s3Var.a(canvas);
    }
}
