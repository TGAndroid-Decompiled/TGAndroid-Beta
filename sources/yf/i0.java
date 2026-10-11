package yf;

import ai.l2;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.op0;
import org.telegram.ui.s3;
public abstract class i0 {
    public static final l2 f52292a = new l2(23);
    public static final l2 f52293b = new l2(24);
    public static Path f52294c;
    public static Outline d;
    public static Rect f52295e;

    public static void a(Canvas canvas, op0 op0Var, s3 s3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = op0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && op0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f52294c == null) {
                    f52294c = new Path();
                    d = new Outline();
                    f52295e = new Rect();
                }
                path = f52294c;
                outline = d;
                rect = f52295e;
                outline.setEmpty();
                rect.setEmpty();
            } else {
                path = new Path();
                outline = new Outline();
                rect = new Rect();
            }
            Path path2 = path;
            outlineProvider.getOutline(op0Var, outline);
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
                s3Var.run(canvas);
                canvas.restoreToCount(save);
                return;
            }
            s3Var.run(canvas);
            return;
        }
        s3Var.run(canvas);
    }
}
