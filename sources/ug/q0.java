package ug;

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
import gi.c5;
import gi.x5;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ba;
public final class q0 extends org.telegram.ui.Cells.q1 {
    public final ba f56214kd;
    public final float[] f56215ld;
    public final Path f56216md;
    public final Paint f56217nd;
    public final Rect f56218od;
    public final RectF f56219pd;
    public final r0 f56220qd;

    public q0(r0 r0Var, Context context, int i3, s0 s0Var) {
        super(context, i3, false, null, s0Var);
        this.f56220qd = r0Var;
        this.f56214kd = new ba(r0Var.d, this, 10, false);
        this.f56215ld = new float[8];
        this.f56216md = new Path();
        Paint paint = new Paint();
        this.f56217nd = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f56218od = new Rect();
        this.f56219pd = new RectF();
    }

    @Override
    public final Paint Z1(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.f56220qd.h.f56268w0 = true;
            Paint c2 = this.f56214kd.c(1.0f);
            if (c2 != null) {
                return c2;
            }
        }
        return super.Z1(str);
    }

    @Override
    public final boolean l1(Canvas canvas) {
        x5 x5Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        r0 r0Var = this.f56220qd;
        c5 c5Var = r0Var.h;
        if (r0Var.f56235f && photoImage != null && (((x5Var = r0Var.f56234e) != null && x5Var.f13843g && x5Var.d && c5Var.f56270y0) || c5Var.f56267v0 || (c5Var.f56269x0 != null && c5Var.N0.f13227s0))) {
            int i3 = 0;
            while (true) {
                int[] iArr = photoImage.X0;
                int length = iArr.length;
                fArr = this.f56215ld;
                if (i3 >= length) {
                    break;
                }
                int i10 = i3 * 2;
                float f10 = iArr[i3];
                fArr[i10] = f10;
                fArr[i10 + 1] = f10;
                i3++;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(photoImage.L0, photoImage.M0, photoImage.y(), photoImage.A());
            Path path = this.f56216md;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = c5Var.f56269x0;
            if (textureView != null && c5Var.N0.f13227s0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.N0 / c5Var.f56271z0, photoImage.O0 / c5Var.A0);
                    canvas.translate(photoImage.r() - ((c5Var.f56271z0 * max) / 2.0f), photoImage.s() - ((c5Var.A0 * max) / 2.0f));
                    canvas.scale((c5Var.f56271z0 / c5Var.f56269x0.getWidth()) * max, (c5Var.A0 / c5Var.f56269x0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.f56218od;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.f56219pd;
                    rectF2.set(0.0f, 0.0f, c5Var.f56269x0.getWidth(), c5Var.f56269x0.getHeight());
                    canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                    canvas.restore();
                    return true;
                }
                return super.l1(canvas);
            }
            canvas.drawPath(path, this.f56217nd);
            return true;
        }
        return super.l1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        r0 r0Var = this.f56220qd;
        x5 x5Var = r0Var.f56234e;
        if ((x5Var != null && x5Var.f13843g && x5Var.d) || r0Var.h.f56267v0) {
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
