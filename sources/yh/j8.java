package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cg0;
import org.telegram.ui.eb0;
public final class j8 extends AnimatorListenerAdapter {
    public final zg.k0 f51506a;
    public final View f51507b;
    public final ai.h1[] f51508c;
    public final boolean[] d;
    public final RectF f51509e;
    public final Runnable f51510f;
    public final r8 h;

    public j8(r8 r8Var, zg.k0 k0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = r8Var;
        this.f51506a = k0Var;
        this.f51507b = view;
        this.f51508c = h1VarArr;
        this.d = zArr;
        this.f51509e = rectF;
        this.f51510f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        eb0 eb0Var;
        r8 r8Var = this.h;
        cg0 cg0Var = r8Var.J;
        cg0Var.setVisibility(4);
        cg0Var.setPaused(true);
        zg.k0 k0Var = this.f51506a;
        if (k0Var != null) {
            k0Var.f53450l = true;
        }
        View view = this.f51507b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f51508c[0];
        if (h1Var != null) {
            h1Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f51509e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                r8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f51510f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (eb0Var = launchActivity.f33831x0) != null) {
            eb0Var.c(true);
        }
    }
}
