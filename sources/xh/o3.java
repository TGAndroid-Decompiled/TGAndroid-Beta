package xh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.m20;
public final class o3 extends FrameLayout {
    public final x0 f45798a;
    public final n3 f45799b;
    public final n3 f45800c;
    public final n3 d;
    public boolean e;
    public final m20 f45801f;
    public final RectF h;

    public o3(Context context, org.telegram.ui.ActionBar.f6 f6Var, x0 x0Var) {
        super(context);
        this.f45801f = new m20();
        this.h = new RectF();
        this.f45798a = x0Var;
        n3 n3Var = new n3(context, f6Var);
        this.f45799b = n3Var;
        n3 n3Var2 = new n3(context, f6Var);
        this.f45800c = n3Var2;
        n3 n3Var3 = new n3(context, f6Var);
        this.d = n3Var3;
        addView(n3Var, w7.a6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(n3Var2, w7.a6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(n3Var3, w7.a6.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(e3 e3Var, float f7, boolean z10, e3 e3Var2, float f10, boolean z11, e3 e3Var3, float f11, boolean z12) {
        x0 x0Var = this.f45798a;
        n3 n3Var = this.f45799b;
        if (e3Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            n3Var.setVisibility(0);
            n3Var.e(e3Var.f45367a, e3Var.f45368b, x0Var);
            n3Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            n3Var.setVisibility(4);
        }
        n3 n3Var2 = this.f45800c;
        if (e3Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            n3Var2.setVisibility(0);
            n3Var2.e(e3Var2.f45367a, e3Var2.f45368b, x0Var);
            n3Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new qg.o(n3Var2, 9));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            n3Var2.setVisibility(4);
        }
        n3 n3Var3 = this.d;
        if (e3Var3 != null) {
            float f14 = f11;
            if (z12) {
                f14 = Math.max(0.5f, f14);
            }
            n3Var3.setVisibility(0);
            n3Var3.e(e3Var3.f45367a, e3Var3.f45368b, x0Var);
            n3Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
            return;
        }
        n3Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
        m20 m20Var = this.f45801f;
        m20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        m20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
    }
}
