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
import ci.a7;
import ci.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.oa;
public final class z0 extends org.telegram.ui.Cells.u1 {
    public final oa Ge;
    public final float[] He;
    public final Path Ie;
    public final Paint Je;
    public final Rect Ke;
    public final RectF Le;
    public final a1 Me;

    public z0(a1 a1Var, Context context, int i10, com.google.firebase.messaging.n nVar) {
        super(context, i10, false, null, nVar);
        this.Me = a1Var;
        this.Ge = new oa(a1Var.d, this, 10, false);
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
            this.Me.h.f45018v0 = true;
            Paint c10 = this.Ge.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.M2(str);
    }

    @Override
    public final boolean a2(Canvas canvas) {
        a7 a7Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        a1 a1Var = this.Me;
        b6 b6Var = a1Var.h;
        if (a1Var.f44962f && photoImage != null && (((a7Var = a1Var.f44961e) != null && a7Var.f4704g && a7Var.d && b6Var.f45020x0) || b6Var.f45017u0 || (b6Var.f45019w0 != null && b6Var.M0.I0))) {
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
            TextureView textureView = b6Var.f45019w0;
            if (textureView != null && b6Var.M0.I0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.getImageWidth() / b6Var.f45021y0, photoImage.getImageHeight() / b6Var.f45022z0);
                    canvas.translate(photoImage.getCenterX() - ((b6Var.f45021y0 * max) / 2.0f), photoImage.getCenterY() - ((b6Var.f45022z0 * max) / 2.0f));
                    canvas.scale((b6Var.f45021y0 / b6Var.f45019w0.getWidth()) * max, (b6Var.f45022z0 / b6Var.f45019w0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Ke;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Le;
                    rectF2.set(0.0f, 0.0f, b6Var.f45019w0.getWidth(), b6Var.f45019w0.getHeight());
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
        a1 a1Var = this.Me;
        a7 a7Var = a1Var.f44961e;
        if ((a7Var != null && a7Var.f4704g && a7Var.d) || a1Var.h.f45017u0) {
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
