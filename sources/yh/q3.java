package yh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.l20;
public final class q3 extends FrameLayout {
    public final x0 f47609a;
    public final p3 f47610b;
    public final p3 f47611c;
    public final p3 d;
    public boolean e;
    public final l20 f47612f;
    public final RectF h;

    public q3(Context context, org.telegram.ui.ActionBar.e6 e6Var, x0 x0Var) {
        super(context);
        this.f47612f = new l20();
        this.h = new RectF();
        this.f47609a = x0Var;
        p3 p3Var = new p3(context, e6Var);
        this.f47610b = p3Var;
        p3 p3Var2 = new p3(context, e6Var);
        this.f47611c = p3Var2;
        p3 p3Var3 = new p3(context, e6Var);
        this.d = p3Var3;
        addView(p3Var, w7.x5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(p3Var2, w7.x5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(p3Var3, w7.x5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(g3 g3Var, float f7, boolean z10, g3 g3Var2, float f10, boolean z11, g3 g3Var3, float f11, boolean z12) {
        x0 x0Var = this.f47609a;
        p3 p3Var = this.f47610b;
        if (g3Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            p3Var.setVisibility(0);
            p3Var.e(g3Var.f47153a, g3Var.f47154b, x0Var);
            p3Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            p3Var.setVisibility(4);
        }
        p3 p3Var2 = this.f47611c;
        if (g3Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            p3Var2.setVisibility(0);
            p3Var2.e(g3Var2.f47153a, g3Var2.f47154b, x0Var);
            p3Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(p3Var2, 23));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            p3Var2.setVisibility(4);
        }
        p3 p3Var3 = this.d;
        if (g3Var3 != null) {
            float f14 = f11;
            if (z12) {
                f14 = Math.max(0.5f, f14);
            }
            p3Var3.setVisibility(0);
            p3Var3.e(g3Var3.f47153a, g3Var3.f47154b, x0Var);
            p3Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
            return;
        }
        p3Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
        l20 l20Var = this.f47612f;
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
