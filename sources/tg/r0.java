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
import hi.b5;
import hi.v5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ga;
public final class r0 extends org.telegram.ui.Cells.r1 {
    public final float[] Ad;
    public final Path Bd;
    public final Paint Cd;
    public final Rect Dd;
    public final RectF Ed;
    public final s0 Fd;
    public final ga f58106zd;

    public r0(s0 s0Var, Context context, int i7, t0 t0Var) {
        super(context, i7, false, null, t0Var);
        this.Fd = s0Var;
        this.f58106zd = new ga(s0Var.d, this, 10, false);
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
            this.Fd.h.f58145w0 = true;
            Paint c10 = this.f58106zd.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.a2(str);
    }

    @Override
    public final boolean l1(Canvas canvas) {
        v5 v5Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        s0 s0Var = this.Fd;
        b5 b5Var = s0Var.h;
        if (s0Var.f58121f && photoImage != null && (((v5Var = s0Var.f58120e) != null && v5Var.f15576g && v5Var.d && b5Var.f58147y0) || b5Var.f58144v0 || (b5Var.f58146x0 != null && b5Var.N0.f14924s0))) {
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
            TextureView textureView = b5Var.f58146x0;
            if (textureView != null && b5Var.N0.f14924s0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.N0 / b5Var.f58148z0, photoImage.O0 / b5Var.A0);
                    canvas.translate(photoImage.r() - ((b5Var.f58148z0 * max) / 2.0f), photoImage.s() - ((b5Var.A0 * max) / 2.0f));
                    canvas.scale((b5Var.f58148z0 / b5Var.f58146x0.getWidth()) * max, (b5Var.A0 / b5Var.f58146x0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Dd;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Ed;
                    rectF2.set(0.0f, 0.0f, b5Var.f58146x0.getWidth(), b5Var.f58146x0.getHeight());
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
        s0 s0Var = this.Fd;
        v5 v5Var = s0Var.f58120e;
        if ((v5Var != null && v5Var.f15576g && v5Var.d) || s0Var.h.f58144v0) {
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
