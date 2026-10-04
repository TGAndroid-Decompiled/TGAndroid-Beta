package yh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.k20;
public final class o3 extends FrameLayout {
    public final x0 f51743a;
    public final n3 f51744b;
    public final n3 f51745c;
    public final n3 d;
    public boolean f51746e;
    public final k20 f51747f;
    public final RectF h;

    public o3(Context context, org.telegram.ui.ActionBar.d6 d6Var, x0 x0Var) {
        super(context);
        this.f51747f = new k20();
        this.h = new RectF();
        this.f51743a = x0Var;
        n3 n3Var = new n3(context, d6Var);
        this.f51744b = n3Var;
        n3 n3Var2 = new n3(context, d6Var);
        this.f51745c = n3Var2;
        n3 n3Var3 = new n3(context, d6Var);
        this.d = n3Var3;
        addView(n3Var, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(n3Var2, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(n3Var3, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(e3 e3Var, float f7, boolean z10, e3 e3Var2, float f10, boolean z11, e3 e3Var3, float f11, boolean z12) {
        x0 x0Var = this.f51743a;
        n3 n3Var = this.f51744b;
        if (e3Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            n3Var.setVisibility(0);
            n3Var.e(e3Var.f51224a, e3Var.f51225b, x0Var);
            n3Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            n3Var.setVisibility(4);
        }
        n3 n3Var2 = this.f51745c;
        if (e3Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            n3Var2.setVisibility(0);
            n3Var2.e(e3Var2.f51224a, e3Var2.f51225b, x0Var);
            n3Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.f51746e) {
                this.f51746e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(n3Var2, 23));
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
            n3Var3.e(e3Var3.f51224a, e3Var3.f51225b, x0Var);
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
        k20 k20Var = this.f51747f;
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
