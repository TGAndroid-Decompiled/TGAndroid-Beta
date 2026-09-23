package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb0;
import org.telegram.ui.zf0;
public final class g8 extends AnimatorListenerAdapter {
    public final zg.n0 f47140a;
    public final View f47141b;
    public final ai.h1[] f47142c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f47143f;
    public final o8 h;

    public g8(o8 o8Var, zg.n0 n0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = o8Var;
        this.f47140a = n0Var;
        this.f47141b = view;
        this.f47142c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f47143f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        bb0 bb0Var;
        o8 o8Var = this.h;
        zf0 zf0Var = o8Var.J;
        zf0Var.setVisibility(4);
        zf0Var.setPaused(true);
        zg.n0 n0Var = this.f47140a;
        if (n0Var != null) {
            n0Var.f49051l = true;
        }
        View view = this.f47141b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f47142c[0];
        if (h1Var != null) {
            h1Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                o8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f47143f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (bb0Var = launchActivity.f30829x0) != null) {
            bb0Var.c(true);
        }
    }
}
