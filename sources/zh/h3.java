package zh;

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
import org.telegram.ui.p20;
public final class h3 extends View {
    public float E;
    public final Camera F;
    public final p20 G;
    public final RectF H;
    public c3 f50613a;
    public c3 f50614b;
    public c3 f50615c;
    public float d;
    public float e;
    public float f50616f;
    public boolean h;
    public boolean f50617n;
    public boolean f50618r;
    public b3 f50619s;
    public b3 v;
    public b3 f50620w;
    public float f50621x;
    public float f50622y;

    public h3(Context context) {
        super(context);
        this.F = new Camera();
        this.G = new p20();
        this.H = new RectF();
    }

    public final void a(Canvas canvas, b3 b3Var, float f7, float f10, float f11, int[] iArr, int[] iArr2, int[] iArr3) {
        float f12;
        float f13;
        float f14;
        if (b3Var != null) {
            Matrix matrix = b3Var.d;
            Paint paint = b3Var.f50298c;
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
                b3Var.e.setLocalMatrix(matrix);
                paint.setAlpha((int) (clamp01 * 255.0f));
                canvas.drawRect(f17, 0.0f, f18, f11, paint);
                canvas.save();
                float dp = AndroidUtilities.dp(90.0f);
                RectF rectF = this.H;
                rectF.set(f17, 0.0f, f17 + dp, f11);
                p20 p20Var = this.G;
                p20Var.b(canvas, rectF, 0, 1.0f);
                rectF.set(f18 - dp, 0.0f, f18, f11);
                p20Var.b(canvas, rectF, 2, 1.0f);
                canvas.restore();
                canvas.restore();
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    float width = (getWidth() / (iArr.length - 1)) * i10;
                    if (width >= f17 && width <= f18) {
                        f14 = Math.min(Utilities.clamp01((width - f17) / max), Utilities.clamp01(1.0f - ((width - (f18 - max)) / max)));
                    } else {
                        f14 = 0.0f;
                    }
                    iArr[i10] = org.telegram.ui.ActionBar.g6.v(iArr[i10], org.telegram.ui.ActionBar.g6.m1(clamp01 * f14, b3Var.f50300g));
                }
                for (int i11 = 0; i11 < iArr2.length; i11++) {
                    float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                    if (width2 >= f17 && width2 <= f18) {
                        f13 = Math.min(Utilities.clamp01((width2 - f17) / max), Utilities.clamp01(1.0f - ((width2 - (f18 - max)) / max)));
                    } else {
                        f13 = 0.0f;
                    }
                    iArr2[i11] = org.telegram.ui.ActionBar.g6.v(iArr2[i11], org.telegram.ui.ActionBar.g6.m1(clamp01 * f13, b3Var.f50299f));
                }
                for (int i12 = 0; i12 < iArr3.length; i12++) {
                    float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                    if (width3 >= f17 && width3 <= f18) {
                        f12 = Math.min(Utilities.clamp01((width3 - f17) / max), Utilities.clamp01(1.0f - ((width3 - (f18 - max)) / max)));
                    } else {
                        f12 = 0.0f;
                    }
                    iArr3[i12] = org.telegram.ui.ActionBar.g6.v(iArr3[i12], org.telegram.ui.ActionBar.g6.m1(clamp01 * f12, b3Var.h));
                }
            }
        }
    }

    public final void b(Canvas canvas, c3 c3Var, float f7, boolean z10) {
        if (c3Var == null) {
            return;
        }
        ImageReceiver imageReceiver = c3Var.d;
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
        if (this.f50613a == null && this.f50614b == null && this.f50615c == null && this.f50619s == null && this.v == null && this.f50620w == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f50615c = null;
        this.f50614b = null;
        this.f50613a = null;
        this.f50616f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.f50618r = false;
        this.f50617n = false;
        this.h = false;
        this.f50620w = null;
        this.v = null;
        this.f50619s = null;
        this.E = 0.0f;
        this.f50622y = 0.0f;
        this.f50621x = 0.0f;
        if (z10) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.f50613a, this.d, this.h);
        b(canvas, this.f50614b, this.e, this.f50617n);
        b(canvas, this.f50615c, this.f50616f, this.f50618r);
    }
}
