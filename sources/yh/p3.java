package yh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.k20;
public final class p3 extends FrameLayout {
    public final y0 f51792a;
    public final o3 f51793b;
    public final o3 f51794c;
    public final o3 d;
    public boolean f51795e;
    public final k20 f51796f;
    public final RectF h;

    public p3(Context context, org.telegram.ui.ActionBar.d6 d6Var, y0 y0Var) {
        super(context);
        this.f51796f = new k20();
        this.h = new RectF();
        this.f51792a = y0Var;
        o3 o3Var = new o3(context, d6Var);
        this.f51793b = o3Var;
        o3 o3Var2 = new o3(context, d6Var);
        this.f51794c = o3Var2;
        o3 o3Var3 = new o3(context, d6Var);
        this.d = o3Var3;
        addView(o3Var, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(o3Var2, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(o3Var3, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(f3 f3Var, float f7, boolean z10, f3 f3Var2, float f10, boolean z11, f3 f3Var3, float f11, boolean z12) {
        y0 y0Var = this.f51792a;
        o3 o3Var = this.f51793b;
        if (f3Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            o3Var.setVisibility(0);
            o3Var.e(f3Var.f51289a, f3Var.f51290b, y0Var);
            o3Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            o3Var.setVisibility(4);
        }
        o3 o3Var2 = this.f51794c;
        if (f3Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            o3Var2.setVisibility(0);
            o3Var2.e(f3Var2.f51289a, f3Var2.f51290b, y0Var);
            o3Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.f51795e) {
                this.f51795e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(o3Var2, 23));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            o3Var2.setVisibility(4);
        }
        o3 o3Var3 = this.d;
        if (f3Var3 != null) {
            float f14 = f11;
            if (z12) {
                f14 = Math.max(0.5f, f14);
            }
            o3Var3.setVisibility(0);
            o3Var3.e(f3Var3.f51289a, f3Var3.f51290b, y0Var);
            o3Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
            return;
        }
        o3Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
        k20 k20Var = this.f51796f;
        k20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        k20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
    }
}
