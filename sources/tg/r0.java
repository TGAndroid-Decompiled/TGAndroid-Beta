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
import fi.e5;
import fi.x5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ca;
public final class r0 extends org.telegram.ui.Cells.q1 {
    public final ca f55921ld;
    public final float[] f55922md;
    public final Path f55923nd;
    public final Paint f55924od;
    public final Rect f55925pd;
    public final RectF f55926qd;
    public final s0 f55927rd;

    public r0(s0 s0Var, Context context, int i7, t0 t0Var) {
        super(context, i7, false, null, t0Var);
        this.f55927rd = s0Var;
        this.f55921ld = new ca(s0Var.d, this, 10, false);
        this.f55922md = new float[8];
        this.f55923nd = new Path();
        Paint paint = new Paint();
        this.f55924od = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f55925pd = new Rect();
        this.f55926qd = new RectF();
    }

    @Override
    public final Paint Z1(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.f55927rd.h.f55967v0 = true;
            Paint c10 = this.f55921ld.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.Z1(str);
    }

    @Override
    public final boolean l1(Canvas canvas) {
        x5 x5Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        s0 s0Var = this.f55927rd;
        e5 e5Var = s0Var.h;
        if (s0Var.f55943f && photoImage != null && (((x5Var = s0Var.f55942e) != null && x5Var.f13085g && x5Var.d && e5Var.f55969x0) || e5Var.f55966u0 || (e5Var.f55968w0 != null && e5Var.M0.f12543r0))) {
            int i7 = 0;
            while (true) {
                int[] iArr = photoImage.W0;
                int length = iArr.length;
                fArr = this.f55922md;
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
            rectF.set(photoImage.K0, photoImage.L0, photoImage.y(), photoImage.A());
            Path path = this.f55923nd;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = e5Var.f55968w0;
            if (textureView != null && e5Var.M0.f12543r0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.M0 / e5Var.f55970y0, photoImage.N0 / e5Var.f55971z0);
                    canvas.translate(photoImage.r() - ((e5Var.f55970y0 * max) / 2.0f), photoImage.s() - ((e5Var.f55971z0 * max) / 2.0f));
                    canvas.scale((e5Var.f55970y0 / e5Var.f55968w0.getWidth()) * max, (e5Var.f55971z0 / e5Var.f55968w0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.f55925pd;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.f55926qd;
                    rectF2.set(0.0f, 0.0f, e5Var.f55968w0.getWidth(), e5Var.f55968w0.getHeight());
                    canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                    canvas.restore();
                    return true;
                }
                return super.l1(canvas);
            }
            canvas.drawPath(path, this.f55924od);
            return true;
        }
        return super.l1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        s0 s0Var = this.f55927rd;
        x5 x5Var = s0Var.f55942e;
        if ((x5Var != null && x5Var.f13085g && x5Var.d) || s0Var.h.f55966u0) {
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
