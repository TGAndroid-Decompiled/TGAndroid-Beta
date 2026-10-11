package yh;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.i20;
public final class i3 extends View {
    public float E;
    public final Camera F;
    public final i20 G;
    public final RectF H;
    public d3 f52759a;
    public d3 f52760b;
    public d3 f52761c;
    public float d;
    public float f52762e;
    public float f52763f;
    public boolean h;
    public boolean f52764n;
    public boolean f52765r;
    public c3 f52766s;
    public c3 v;
    public c3 f52767w;
    public float f52768x;
    public float f52769y;

    public i3(Context context) {
        super(context);
        this.F = new Camera();
        this.G = new i20();
        this.H = new RectF();
    }

    public final void a(Canvas canvas, c3 c3Var, float f7, float f10, float f11, int[] iArr, int[] iArr2, int[] iArr3) {
        float f12;
        float f13;
        float f14;
        if (c3Var != null) {
            Matrix matrix = c3Var.d;
            Paint paint = c3Var.f52426c;
            if (paint != null) {
                float f15 = (f7 - 0.5f) / 1.5f;
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(f15));
                float max = Math.max(0.8f * f10, AndroidUtilities.dp(180.0f));
                float f16 = (f10 / 2.0f) - ((f15 * max) * 1.8f);
                float f17 = f16 - max;
                float f18 = f16 + max;
                canvas.saveLayerAlpha(f17, 0.0f, f18, f11, 255, 31);
                matrix.reset();
                matrix.postTranslate(f16, Math.min(AndroidUtilities.dp(176.0f), f11) / 2.0f);
                c3Var.f52427e.setLocalMatrix(matrix);
                paint.setAlpha((int) (clamp01 * 255.0f));
                canvas.drawRect(f17, 0.0f, f18, f11, paint);
                canvas.save();
                float dp = AndroidUtilities.dp(90.0f);
                RectF rectF = this.H;
                rectF.set(f17, 0.0f, f17 + dp, f11);
                i20 i20Var = this.G;
                i20Var.b(canvas, rectF, 0, 1.0f);
                rectF.set(f18 - dp, 0.0f, f18, f11);
                i20Var.b(canvas, rectF, 2, 1.0f);
                canvas.restore();
                canvas.restore();
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    float width = (getWidth() / (iArr.length - 1)) * i10;
                    if (width >= f17 && width <= f18) {
                        f14 = Math.min(Utilities.clamp01((width - f17) / max), Utilities.clamp01(1.0f - ((width - (f18 - max)) / max)));
                    } else {
                        f14 = 0.0f;
                    }
                    iArr[i10] = org.telegram.ui.ActionBar.h6.v(iArr[i10], org.telegram.ui.ActionBar.h6.m1(clamp01 * f14, c3Var.f52429g));
                }
                for (int i11 = 0; i11 < iArr2.length; i11++) {
                    float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                    if (width2 >= f17 && width2 <= f18) {
                        f13 = Math.min(Utilities.clamp01((width2 - f17) / max), Utilities.clamp01(1.0f - ((width2 - (f18 - max)) / max)));
                    } else {
                        f13 = 0.0f;
                    }
                    iArr2[i11] = org.telegram.ui.ActionBar.h6.v(iArr2[i11], org.telegram.ui.ActionBar.h6.m1(clamp01 * f13, c3Var.f52428f));
                }
                for (int i12 = 0; i12 < iArr3.length; i12++) {
                    float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                    if (width3 >= f17 && width3 <= f18) {
                        f12 = Math.min(Utilities.clamp01((width3 - f17) / max), Utilities.clamp01(1.0f - ((width3 - (f18 - max)) / max)));
                    } else {
                        f12 = 0.0f;
                    }
                    iArr3[i12] = org.telegram.ui.ActionBar.h6.v(iArr3[i12], org.telegram.ui.ActionBar.h6.m1(clamp01 * f12, c3Var.h));
                }
            }
        }
    }

    public final void b(Canvas canvas, d3 d3Var, float f7, boolean z10) {
        if (d3Var == null) {
            return;
        }
        ImageReceiver imageReceiver = d3Var.d;
        float f10 = f7;
        if (z10) {
            f10 = Math.max(0.5f, f10);
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageWidth = imageReceiver.getImageWidth();
        float imageHeight = imageReceiver.getImageHeight();
        float alpha = imageReceiver.getAlpha();
        float f11 = (f10 - 0.5f) / 1.5f;
        float clamp01 = Utilities.clamp01(1.0f - Math.abs(f11));
        float width = (getWidth() / 2.0f) - (AndroidUtilities.dp(220.0f) * f11);
        float dp = AndroidUtilities.dp(80.0f);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, clamp01);
        float dp2 = AndroidUtilities.dp(160.0f);
        canvas.save();
        float f12 = ((dp2 / 2.0f) * f11) + width;
        canvas.translate(f12, dp);
        Camera camera = this.F;
        camera.save();
        camera.rotateY(f11 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f12, -dp);
        float f13 = dp2 * lerp;
        float f14 = f13 / 2.0f;
        imageReceiver.setImageCoords(width - f14, dp - f14, f13, f13);
        imageReceiver.setAlpha(clamp01);
        imageReceiver.draw(canvas);
        imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z10;
        if (this.f52759a == null && this.f52760b == null && this.f52761c == null && this.f52766s == null && this.v == null && this.f52767w == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f52761c = null;
        this.f52760b = null;
        this.f52759a = null;
        this.f52763f = 0.0f;
        this.f52762e = 0.0f;
        this.d = 0.0f;
        this.f52765r = false;
        this.f52764n = false;
        this.h = false;
        this.f52767w = null;
        this.v = null;
        this.f52766s = null;
        this.E = 0.0f;
        this.f52769y = 0.0f;
        this.f52768x = 0.0f;
        if (z10) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.f52759a, this.d, this.h);
        b(canvas, this.f52760b, this.f52762e, this.f52764n);
        b(canvas, this.f52761c, this.f52763f, this.f52765r);
    }
}
