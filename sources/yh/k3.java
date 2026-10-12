package yh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.l20;
public final class k3 extends FrameLayout {
    public final w0 f52997a;
    public final j3 f52998b;
    public final j3 f52999c;
    public final j3 d;
    public boolean f53000e;
    public final l20 f53001f;
    public final RectF h;

    public k3(Context context, org.telegram.ui.ActionBar.c6 c6Var, w0 w0Var) {
        super(context);
        this.f53001f = new l20();
        this.h = new RectF();
        this.f52997a = w0Var;
        j3 j3Var = new j3(context, c6Var);
        this.f52998b = j3Var;
        j3 j3Var2 = new j3(context, c6Var);
        this.f52999c = j3Var2;
        j3 j3Var3 = new j3(context, c6Var);
        this.d = j3Var3;
        addView(j3Var, w7.w5.a(-2.0f, 12.66f, 5.33f, 12.66f, 5.33f, -2, 51));
        addView(j3Var2, w7.w5.a(-2.0f, 12.66f, 5.33f, 12.66f, 5.33f, -2, 51));
        addView(j3Var3, w7.w5.a(-2.0f, 12.66f, 5.33f, 12.66f, 5.33f, -2, 51));
    }

    public final void a(a3 a3Var, float f7, boolean z10, a3 a3Var2, float f10, boolean z11, a3 a3Var3, float f11, boolean z12) {
        w0 w0Var = this.f52997a;
        j3 j3Var = this.f52998b;
        if (a3Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            j3Var.setVisibility(0);
            j3Var.e(a3Var.f52466a, a3Var.f52467b, w0Var);
            j3Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            j3Var.setVisibility(4);
        }
        j3 j3Var2 = this.f52999c;
        if (a3Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            j3Var2.setVisibility(0);
            j3Var2.e(a3Var2.f52466a, a3Var2.f52467b, w0Var);
            j3Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.f53000e) {
                this.f53000e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.s0(j3Var2, 23));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            j3Var2.setVisibility(4);
        }
        j3 j3Var3 = this.d;
        if (a3Var3 != null) {
            float f14 = f11;
            if (z12) {
                f14 = Math.max(0.5f, f14);
            }
            j3Var3.setVisibility(0);
            j3Var3.e(a3Var3.f52466a, a3Var3.f52467b, w0Var);
            j3Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
            return;
        }
        j3Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
        l20 l20Var = this.f53001f;
        l20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        l20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
    }
}
