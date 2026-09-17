package qg;

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
import ci.c6;
import ci.c7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.la;
public final class c1 extends org.telegram.ui.Cells.t1 {
    public final la Fe;
    public final float[] Ge;
    public final Path He;
    public final Paint Ie;
    public final Rect Je;
    public final RectF Ke;
    public final d1 Le;

    public c1(d1 d1Var, Context context, int i10, com.google.firebase.messaging.n nVar) {
        super(context, i10, false, null, nVar);
        this.Le = d1Var;
        this.Fe = new la(d1Var.d, this, 10, false);
        this.Ge = new float[8];
        this.He = new Path();
        Paint paint = new Paint();
        this.Ie = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Je = new Rect();
        this.Ke = new RectF();
    }

    @Override
    public final Paint M2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Le.h.f41397v0 = true;
            Paint c10 = this.Fe.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.M2(str);
    }

    @Override
    public final boolean a2(Canvas canvas) {
        c7 c7Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        d1 d1Var = this.Le;
        c6 c6Var = d1Var.h;
        if (d1Var.f41352f && photoImage != null && (((c7Var = d1Var.e) != null && c7Var.f4434g && c7Var.d && c6Var.f41399x0) || c6Var.f41396u0 || (c6Var.f41398w0 != null && c6Var.M0.I0))) {
            int i10 = 0;
            while (true) {
                int length = photoImage.getRoundRadius().length;
                fArr = this.Ge;
                if (i10 >= length) {
                    break;
                }
                int i11 = i10 * 2;
                fArr[i11] = photoImage.getRoundRadius()[i10];
                fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
                i10++;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(photoImage.getImageX(), photoImage.getImageY(), photoImage.getImageX2(), photoImage.getImageY2());
            Path path = this.He;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = c6Var.f41398w0;
            if (textureView != null && c6Var.M0.I0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.getImageWidth() / c6Var.f41400y0, photoImage.getImageHeight() / c6Var.f41401z0);
                    canvas.translate(photoImage.getCenterX() - ((c6Var.f41400y0 * max) / 2.0f), photoImage.getCenterY() - ((c6Var.f41401z0 * max) / 2.0f));
                    canvas.scale((c6Var.f41400y0 / c6Var.f41398w0.getWidth()) * max, (c6Var.f41401z0 / c6Var.f41398w0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Je;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Ke;
                    rectF2.set(0.0f, 0.0f, c6Var.f41398w0.getWidth(), c6Var.f41398w0.getHeight());
                    canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                    canvas.restore();
                    return true;
                }
                return super.a2(canvas);
            }
            canvas.drawPath(path, this.Ie);
            return true;
        }
        return super.a2(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        d1 d1Var = this.Le;
        c7 c7Var = d1Var.e;
        if ((c7Var != null && c7Var.f4434g && c7Var.d) || d1Var.h.f41396u0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        S1(canvas2);
        canvas2.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
