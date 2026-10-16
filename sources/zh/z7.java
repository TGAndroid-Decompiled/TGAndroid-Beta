package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib0;
import org.telegram.ui.ig0;
public final class z7 extends AnimatorListenerAdapter {
    public final ah.g1 f51387a;
    public final View f51388b;
    public final bi.z0[] f51389c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f51390f;
    public final h8 h;

    public z7(h8 h8Var, ah.g1 g1Var, View view, bi.z0[] z0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = h8Var;
        this.f51387a = g1Var;
        this.f51388b = view;
        this.f51389c = z0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f51390f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ib0 ib0Var;
        h8 h8Var = this.h;
        ig0 ig0Var = h8Var.K;
        ig0Var.setVisibility(4);
        ig0Var.setPaused(true);
        ah.g1 g1Var = this.f51387a;
        if (g1Var != null) {
            g1Var.f755l = true;
        }
        View view = this.f51388b;
        if (view != null) {
            view.invalidate();
        }
        bi.z0 z0Var = this.f51389c[0];
        if (z0Var != null) {
            z0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.e3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                h8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f51390f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (ib0Var = launchActivity.f31849x0) != null) {
            ib0Var.c(true);
        }
    }
}
