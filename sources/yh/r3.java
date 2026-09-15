package yh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.l20;
public final class r3 extends FrameLayout {
    public final x0 f47705a;
    public final q3 f47706b;
    public final q3 f47707c;
    public final q3 d;
    public boolean e;
    public final l20 f47708f;
    public final RectF h;

    public r3(Context context, org.telegram.ui.ActionBar.e6 e6Var, x0 x0Var) {
        super(context);
        this.f47708f = new l20();
        this.h = new RectF();
        this.f47705a = x0Var;
        q3 q3Var = new q3(context, e6Var);
        this.f47706b = q3Var;
        q3 q3Var2 = new q3(context, e6Var);
        this.f47707c = q3Var2;
        q3 q3Var3 = new q3(context, e6Var);
        this.d = q3Var3;
        addView(q3Var, w7.x5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(q3Var2, w7.x5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(q3Var3, w7.x5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(h3 h3Var, float f7, boolean z10, h3 h3Var2, float f10, boolean z11, h3 h3Var3, float f11, boolean z12) {
        x0 x0Var = this.f47705a;
        q3 q3Var = this.f47706b;
        if (h3Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            q3Var.setVisibility(0);
            q3Var.e(h3Var.f47246a, h3Var.f47247b, x0Var);
            q3Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            q3Var.setVisibility(4);
        }
        q3 q3Var2 = this.f47707c;
        if (h3Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            q3Var2.setVisibility(0);
            q3Var2.e(h3Var2.f47246a, h3Var2.f47247b, x0Var);
            q3Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(q3Var2, 23));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            q3Var2.setVisibility(4);
        }
        q3 q3Var3 = this.d;
        if (h3Var3 != null) {
            float f14 = f11;
            if (z12) {
                f14 = Math.max(0.5f, f14);
            }
            q3Var3.setVisibility(0);
            q3Var3.e(h3Var3.f47246a, h3Var3.f47247b, x0Var);
            q3Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
            return;
        }
        q3Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
        l20 l20Var = this.f47708f;
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
