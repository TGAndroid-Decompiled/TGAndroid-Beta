package pg;

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
import bi.b7;
import bi.d8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ma;
public final class z0 extends org.telegram.ui.Cells.t1 {
    public final ma Fe;
    public final float[] Ge;
    public final Path He;
    public final Paint Ie;
    public final Rect Je;
    public final RectF Ke;
    public final a1 Le;

    public z0(a1 a1Var, Context context, int i10, com.google.firebase.messaging.n nVar) {
        super(context, i10, false, null, nVar);
        this.Le = a1Var;
        this.Fe = new ma(a1Var.d, this, 10, false);
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
            this.Le.h.f39987v0 = true;
            Paint c10 = this.Fe.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.M2(str);
    }

    @Override
    public final boolean a2(Canvas canvas) {
        d8 d8Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        a1 a1Var = this.Le;
        b7 b7Var = a1Var.h;
        if (a1Var.f39933f && photoImage != null && (((d8Var = a1Var.e) != null && d8Var.f2555g && d8Var.d && b7Var.f39989x0) || b7Var.f39986u0 || (b7Var.f39988w0 != null && b7Var.M0.I0))) {
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
            TextureView textureView = b7Var.f39988w0;
            if (textureView != null && b7Var.M0.I0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.getImageWidth() / b7Var.f39990y0, photoImage.getImageHeight() / b7Var.f39991z0);
                    canvas.translate(photoImage.getCenterX() - ((b7Var.f39990y0 * max) / 2.0f), photoImage.getCenterY() - ((b7Var.f39991z0 * max) / 2.0f));
                    canvas.scale((b7Var.f39990y0 / b7Var.f39988w0.getWidth()) * max, (b7Var.f39991z0 / b7Var.f39988w0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Je;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Ke;
                    rectF2.set(0.0f, 0.0f, b7Var.f39988w0.getWidth(), b7Var.f39988w0.getHeight());
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
        a1 a1Var = this.Le;
        d8 d8Var = a1Var.e;
        if ((d8Var != null && d8Var.f2555g && d8Var.d) || a1Var.h.f39986u0) {
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
