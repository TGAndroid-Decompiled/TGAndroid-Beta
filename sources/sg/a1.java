package sg;

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
import fi.n6;
import fi.q5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.pa;
public final class a1 extends org.telegram.ui.Cells.s1 {
    public final pa He;
    public final float[] Ie;
    public final Path Je;
    public final Paint Ke;
    public final Rect Le;
    public final RectF Me;
    public final b1 Ne;

    public a1(b1 b1Var, Context context, int i10, f1 f1Var) {
        super(context, i10, false, null, f1Var);
        this.Ne = b1Var;
        this.He = new pa(b1Var.d, this, 10, false);
        this.Ie = new float[8];
        this.Je = new Path();
        Paint paint = new Paint();
        this.Ke = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.Le = new Rect();
        this.Me = new RectF();
    }

    @Override
    public final Paint M2(String str) {
        if ("paintChatActionBackground".equals(str)) {
            this.Ne.h.f48217v0 = true;
            Paint c10 = this.He.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.M2(str);
    }

    @Override
    public final boolean a2(Canvas canvas) {
        n6 n6Var;
        float[] fArr;
        ImageReceiver photoImage = getPhotoImage();
        b1 b1Var = this.Ne;
        q5 q5Var = b1Var.h;
        if (b1Var.f48161f && photoImage != null && (((n6Var = b1Var.e) != null && n6Var.f11306g && n6Var.d && q5Var.f48219x0) || q5Var.f48216u0 || (q5Var.f48218w0 != null && q5Var.M0.f10822x0))) {
            int i10 = 0;
            while (true) {
                int length = photoImage.getRoundRadius().length;
                fArr = this.Ie;
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
            Path path = this.Je;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            TextureView textureView = q5Var.f48218w0;
            if (textureView != null && q5Var.M0.f10822x0) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-getX(), -getY());
                    float max = Math.max(photoImage.getImageWidth() / q5Var.f48220y0, photoImage.getImageHeight() / q5Var.f48221z0);
                    canvas.translate(photoImage.getCenterX() - ((q5Var.f48220y0 * max) / 2.0f), photoImage.getCenterY() - ((q5Var.f48221z0 * max) / 2.0f));
                    canvas.scale((q5Var.f48220y0 / q5Var.f48218w0.getWidth()) * max, (q5Var.f48221z0 / q5Var.f48218w0.getHeight()) * max);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Rect rect = this.Le;
                    rect.set(0, 0, width, height);
                    RectF rectF2 = this.Me;
                    rectF2.set(0.0f, 0.0f, q5Var.f48218w0.getWidth(), q5Var.f48218w0.getHeight());
                    canvas.drawBitmap(bitmap, rect, rectF2, (Paint) null);
                    canvas.restore();
                    return true;
                }
                return super.a2(canvas);
            }
            canvas.drawPath(path, this.Ke);
            return true;
        }
        return super.a2(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        b1 b1Var = this.Ne;
        n6 n6Var = b1Var.e;
        if ((n6Var != null && n6Var.f11306g && n6Var.d) || b1Var.h.f48216u0) {
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
