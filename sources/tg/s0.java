package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.TextureView;
import hi.a5;
import hi.u5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ga;
public final class s0 extends org.telegram.ui.Cells.r1 {
    public final float[] Ad;
    public final Path Bd;
    public final Paint Cd;
    public final Rect Dd;
    public final RectF Ed;
    public final t0 Fd;
    public final ga f58156zd;

    public s0(t0 t0Var, Context context, int i7, u0 u0Var) {
        super(context, i7, false, null, u0Var);
        this.Fd = t0Var;
        this.f58156zd = new ga(t0Var.d, this, 10, false);
        this.Ad = new float[8];
        this.Bd = new Path();
        Paint paint = new Paint();
        this.Cd = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Dd = new Rect();
        this.Ed = new RectF();
    }

    @Override
    public final Paint a2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Fd.h.f58201w0 = true;
            Paint c10 = this.f58156zd.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.a2(str);
    }

    @Override
    public final boolean l1(Canvas canvas) {
        u5 u5Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        t0 t0Var = this.Fd;
        a5 a5Var = t0Var.h;
        if (t0Var.f58172f && photoImage != null && (((u5Var = t0Var.f58171e) != null && u5Var.f15543g && u5Var.d && a5Var.f58203y0) || a5Var.f58200v0 || (a5Var.f58202x0 != null && a5Var.N0.f14899s0))) {
            int i7 = 0;
            while (true) {
                int[] iArr = photoImage.X0;
                int length = iArr.length;
                fArr = this.Ad;
                if (i7 >= length) {
                    break;
                }
                int i10 = i7 * 2;
                float f10 = iArr[i7];
                fArr[i10] = f10;
                fArr[i10 + 1] = f10;
                i7++;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(photoImage.L0, photoImage.M0, photoImage.y(), photoImage.A());
            Path path = this.Bd;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = a5Var.f58202x0;
            if (textureView != null && a5Var.N0.f14899s0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.N0 / a5Var.f58204z0, photoImage.O0 / a5Var.A0);
                    canvas.translate(photoImage.r() - ((a5Var.f58204z0 * max) / 2.0f), photoImage.s() - ((a5Var.A0 * max) / 2.0f));
                    canvas.scale((a5Var.f58204z0 / a5Var.f58202x0.getWidth()) * max, (a5Var.A0 / a5Var.f58202x0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Dd;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Ed;
                    rectF2.set(0.0f, 0.0f, a5Var.f58202x0.getWidth(), a5Var.f58202x0.getHeight());
                    canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                    canvas.restore();
                    return true;
                }
                return super.l1(canvas);
            }
            canvas.drawPath(path, this.Cd);
            return true;
        }
        return super.l1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        t0 t0Var = this.Fd;
        u5 u5Var = t0Var.f58171e;
        if ((u5Var != null && u5Var.f15543g && u5Var.d) || t0Var.h.f58200v0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        d1(canvas2);
        canvas2.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
