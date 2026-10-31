package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ye;
import org.telegram.ui.BubbleActivity;
public final class f0 extends View {
    public final Paint f51123a;
    public final Path f51124b;
    public final RectF f51125c;
    public final g0 d;

    public f0(g0 g0Var, Context context) {
        super(context);
        this.d = g0Var;
        this.f51123a = new Paint(1);
        this.f51124b = new Path();
        this.f51125c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i10;
        boolean z10 = getContext() instanceof BubbleActivity;
        z zVar = this.d.h;
        float f7 = zVar.E;
        if (!z10) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        float f10 = f7 + i10;
        return ((getHeight() - f10) - zVar.D) - org.telegram.messenger.i0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.i0.L(32.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int currentWidth;
        int currentHeight;
        float T1;
        float T12;
        boolean z10;
        ye yeVar;
        float f7;
        float f10;
        jg.e2 e2Var;
        float f11;
        float f12;
        g0 g0Var = this.d;
        z zVar = g0Var.h;
        int[] iArr = g0Var.f51183y;
        k4 k4Var = g0Var.f51174a;
        if (g0Var.f51175b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f51123a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (g0Var.f51180s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (g0Var.f51180s < 1.0f) {
            Path path = this.f51124b;
            path.rewind();
            RectF rectF = this.f51125c;
            rectF.set(0.0f, 0.0f, k4Var.getWidth(), k4Var.getHeight());
            int[] iArr2 = g0Var.f51182x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.i0.Z1(rectF, rectF2, g0Var.f51180s, rectF);
            float W1 = org.telegram.messenger.i0.W1(g0Var.f51180s, org.telegram.messenger.i0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f13 = g0Var.f51180s;
        float f14 = 1.0f - f13;
        int[] iArr3 = g0Var.f51181w;
        canvas.translate((-iArr3[0]) * f14, (-iArr3[1]) * f14);
        int i11 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            if (g0Var.E) {
                g0Var.f51175b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f14, iArr[1] * f14);
            ye yeVar2 = g0Var.f51175b.G0;
            if (yeVar2 != null) {
                f12 = yeVar2.e;
                f11 = yeVar2.f19367f;
            } else {
                f11 = 1.0f;
                f12 = 1.0f;
            }
            float T13 = org.telegram.messenger.i0.T1(1.0f, (g0Var.f51175b.getScaleX() * (e2Var.getWidth() / f12)) / k4Var.getWidth(), f14);
            canvas.scale(T13, T13);
            canvas.rotate(g0Var.f51175b.getRotation() * f14);
            canvas.translate(((g0Var.f51175b.getContentWidth() * f12) / 2.0f) * f14, ((g0Var.f51175b.getContentHeight() * f11) / 2.0f) * f14);
        }
        boolean z11 = getContext() instanceof BubbleActivity;
        float f15 = zVar.E;
        if (!z11) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.i0.L(16.0f)) * f13, (((getContainerHeight() + org.telegram.messenger.i0.L(32.0f)) / 2.0f) + f15 + i10) * f13);
        if (i11 > 0) {
            float contentWidth = g0Var.f51175b.getContentWidth();
            float contentHeight = g0Var.f51175b.getContentHeight();
            ye yeVar3 = g0Var.f51175b.G0;
            if (yeVar3 != null) {
                f7 = yeVar3.e;
            } else {
                f7 = 1.0f;
            }
            if (yeVar3 != null) {
                f10 = yeVar3.f19367f;
            } else {
                f10 = 1.0f;
            }
            float T14 = (org.telegram.messenger.i0.T1(1.0f, f7, f14) * contentWidth) / 2.0f;
            float T15 = (org.telegram.messenger.i0.T1(1.0f, f10, f14) * contentHeight) / 2.0f;
            float T16 = org.telegram.messenger.i0.T1(1.0f, 4.0f, f13);
            canvas.clipRect((-T14) * T16, (-T15) * T16, T14 * T16, T15 * T16);
        }
        currentWidth = g0Var.getCurrentWidth();
        eg.g gVar = g0Var.D;
        currentHeight = g0Var.getCurrentHeight();
        int i12 = gVar.f6546i;
        if (i12 == 90 || i12 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z12 = c3.i0.z(gVar.f6549l, 1.0f, f14, 1.0f);
        float f16 = currentWidth;
        float containerWidth = getContainerWidth() / f16;
        float f17 = currentHeight;
        if (containerWidth * f17 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f17;
        }
        canvas.translate(gVar.d * 1.0f, gVar.e * 1.0f);
        float f18 = (gVar.f6544f / z12) * containerWidth;
        jg.e2 e2Var2 = g0Var.f51175b;
        if (e2Var2 != null && (yeVar = e2Var2.G0) != null) {
            T1 = org.telegram.messenger.i0.T1(yeVar.f19366c, f18, f13);
        } else {
            T1 = org.telegram.messenger.i0.T1(1.0f, f18, f13);
        }
        canvas.scale(T1, T1);
        canvas.translate(gVar.f6542b * f16 * 1.0f, gVar.f6543c * f17 * 1.0f);
        float e = g0Var.d.e(false, i12) + g0Var.f51175b.getOrientation() + gVar.f6545g;
        ye yeVar4 = g0Var.f51175b.G0;
        if (yeVar4 == null) {
            T12 = org.telegram.messenger.i0.T1(0.0f, e, g0Var.f51180s);
        } else {
            T12 = org.telegram.messenger.i0.T1(yeVar4.d + yeVar4.f19370k, e, g0Var.f51180s);
        }
        canvas.rotate(T12);
        canvas.rotate(g0Var.f51175b.getOrientation());
        org.telegram.ui.Components.t5 t5Var = g0Var.f51176c;
        if (g0Var.E) {
            ye yeVar5 = g0Var.f51175b.G0;
            if (yeVar5 != null && yeVar5.f19371l) {
                z10 = true;
            }
            z10 = false;
        } else {
            eg.o oVar = zVar.L;
            if (oVar != null) {
                z10 = oVar.f6580j;
            }
            z10 = false;
        }
        canvas.scale(org.telegram.messenger.i0.T1(1.0f, -1.0f, t5Var.d(z10)), 1.0f);
        canvas.translate((-g0Var.f51175b.getContentWidth()) / 2.0f, (-g0Var.f51175b.getContentHeight()) / 2.0f);
        jg.e2 e2Var3 = g0Var.f51175b;
        Paint paint2 = e2Var3.F0;
        Bitmap bitmap = e2Var3.A0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
