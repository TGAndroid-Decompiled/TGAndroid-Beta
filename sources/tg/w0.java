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
import hi.e6;
import hi.l5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.fa;
public final class w0 extends org.telegram.ui.Cells.r1 {
    public final float[] Ad;
    public final Path Bd;
    public final Paint Cd;
    public final Rect Dd;
    public final RectF Ed;
    public final x0 Fd;
    public final fa f58277zd;

    public w0(x0 x0Var, Context context, int i7, y0 y0Var) {
        super(context, i7, false, null, y0Var);
        this.Fd = x0Var;
        this.f58277zd = new fa(x0Var.d, this, 10, false);
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
            this.Fd.h.f58317x0 = true;
            Paint c10 = this.f58277zd.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.a2(str);
    }

    @Override
    public final boolean l1(Canvas canvas) {
        e6 e6Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        x0 x0Var = this.Fd;
        l5 l5Var = x0Var.h;
        if (x0Var.f58291f && photoImage != null && (((e6Var = x0Var.f58290e) != null && e6Var.f14374g && e6Var.d && l5Var.f58319z0) || l5Var.f58316w0 || (l5Var.f58318y0 != null && l5Var.O0.f15588s0))) {
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
            rectF.set(photoImage.L0, photoImage.M0, photoImage.z(), photoImage.B());
            Path path = this.Bd;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = l5Var.f58318y0;
            if (textureView != null && l5Var.O0.f15588s0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.N0 / l5Var.A0, photoImage.O0 / l5Var.B0);
                    canvas.translate(photoImage.r() - ((l5Var.A0 * max) / 2.0f), photoImage.s() - ((l5Var.B0 * max) / 2.0f));
                    canvas.scale((l5Var.A0 / l5Var.f58318y0.getWidth()) * max, (l5Var.B0 / l5Var.f58318y0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Dd;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Ed;
                    rectF2.set(0.0f, 0.0f, l5Var.f58318y0.getWidth(), l5Var.f58318y0.getHeight());
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
        x0 x0Var = this.Fd;
        e6 e6Var = x0Var.f58290e;
        if ((e6Var != null && e6Var.f14374g && e6Var.d) || x0Var.h.f58316w0) {
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
