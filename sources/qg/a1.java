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
import org.telegram.ui.Components.ma;
public final class a1 extends org.telegram.ui.Cells.u1 {
    public final ma Ge;
    public final float[] He;
    public final Path Ie;
    public final Paint Je;
    public final Rect Ke;
    public final RectF Le;
    public final b1 Me;

    public a1(b1 b1Var, Context context, int i10, com.google.firebase.messaging.n nVar) {
        super(context, i10, false, null, nVar);
        this.Me = b1Var;
        this.Ge = new ma(b1Var.d, this, 10, false);
        this.He = new float[8];
        this.Ie = new Path();
        Paint paint = new Paint();
        this.Je = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Ke = new Rect();
        this.Le = new RectF();
    }

    @Override
    public final Paint M2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Me.h.f41648v0 = true;
            Paint c10 = this.Ge.c(1.0f);
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
        b1 b1Var = this.Me;
        c6 c6Var = b1Var.h;
        if (b1Var.f41601f && photoImage != null && (((c7Var = b1Var.e) != null && c7Var.f4435g && c7Var.d && c6Var.f41650x0) || c6Var.f41647u0 || (c6Var.f41649w0 != null && c6Var.M0.I0))) {
            int i10 = 0;
            while (true) {
                int length = photoImage.getRoundRadius().length;
                fArr = this.He;
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
            Path path = this.Ie;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = c6Var.f41649w0;
            if (textureView != null && c6Var.M0.I0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.getImageWidth() / c6Var.f41651y0, photoImage.getImageHeight() / c6Var.f41652z0);
                    canvas.translate(photoImage.getCenterX() - ((c6Var.f41651y0 * max) / 2.0f), photoImage.getCenterY() - ((c6Var.f41652z0 * max) / 2.0f));
                    canvas.scale((c6Var.f41651y0 / c6Var.f41649w0.getWidth()) * max, (c6Var.f41652z0 / c6Var.f41649w0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Ke;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Le;
                    rectF2.set(0.0f, 0.0f, c6Var.f41649w0.getWidth(), c6Var.f41649w0.getHeight());
                    canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                    canvas.restore();
                    return true;
                }
                return super.a2(canvas);
            }
            canvas.drawPath(path, this.Je);
            return true;
        }
        return super.a2(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        b1 b1Var = this.Me;
        c7 c7Var = b1Var.e;
        if ((c7Var != null && c7Var.f4435g && c7Var.d) || b1Var.h.f41647u0) {
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
