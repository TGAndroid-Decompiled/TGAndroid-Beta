package yf;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class p {
    public static final Rect f50153a = new Rect();

    static {
        new Rect();
        new RectF();
    }

    public static void a(Canvas canvas, Drawable drawable, float f7, float f10, float f11) {
        float dpf2 = f11 / AndroidUtilities.dpf2(72.0f);
        d(drawable, AndroidUtilities.dpf2(9.66f) + (f7 - AndroidUtilities.dpf2(36.0f)), AndroidUtilities.dpf2(4.66f) + (f10 - AndroidUtilities.dpf2(36.0f)), 53);
        canvas.save();
        canvas.scale(dpf2, dpf2, f7, f10);
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void b(Canvas canvas, Drawable drawable, float f7) {
        if (drawable != null && f7 != 0.0f) {
            if (f7 == 1.0f) {
                drawable.draw(canvas);
                return;
            }
            canvas.save();
            canvas.scale(f7, f7, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public static void c(Rect rect, float f7, float f10, int i10, int i11, int i12) {
        int round;
        int round2;
        int i13 = i12 & 7;
        if (i13 != 3) {
            if (i13 != 5) {
                round = Math.round(f7 - (i10 / 2.0f));
            } else {
                round = Math.round(f7 - i10);
            }
        } else {
            round = Math.round(f7);
        }
        int i14 = i12 & 112;
        if (i14 != 48) {
            if (i14 != 80) {
                round2 = Math.round(f10 - (i11 / 2.0f));
            } else {
                round2 = Math.round(f10 - i11);
            }
        } else {
            round2 = Math.round(f10);
        }
        rect.set(round, round2, i10 + round, i11 + round2);
    }

    public static void d(Drawable drawable, float f7, float f10, int i10) {
        if (drawable == null) {
            return;
        }
        e(drawable, f7, f10, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), i10);
    }

    public static void e(Drawable drawable, float f7, float f10, int i10, int i11, int i12) {
        if (drawable != null) {
            Rect rect = f50153a;
            c(rect, f7, f10, i10, i11, i12);
            drawable.setBounds(rect);
        }
    }

    public static void f(ImageReceiver imageReceiver, float f7, float f10, int i10, int i11) {
        if (imageReceiver != null) {
            Rect rect = f50153a;
            c(rect, f7, f10, i10, i11, 17);
            imageReceiver.setImageCoords(rect);
        }
    }

    public static void g(Drawable drawable, int i10, int i11, int i12, int i13) {
        Rect rect = f50153a;
        if (drawable.getPadding(rect)) {
            drawable.setBounds(i10 - rect.left, i11 - rect.top, i12 + rect.right, i13 + rect.bottom);
        } else {
            drawable.setBounds(i10, i11, i12, i13);
        }
    }

    public static void h(NinePatchDrawable ninePatchDrawable, Rect rect) {
        Rect rect2 = f50153a;
        if (ninePatchDrawable.getPadding(rect2)) {
            ninePatchDrawable.setBounds(rect.left - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        } else {
            ninePatchDrawable.setBounds(rect);
        }
    }
}
