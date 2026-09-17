package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gg0;
import org.telegram.ui.ib0;
public final class i8 extends AnimatorListenerAdapter {
    public final zg.n0 f47330a;
    public final View f47331b;
    public final ai.h1[] f47332c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f47333f;
    public final q8 h;

    public i8(q8 q8Var, zg.n0 n0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = q8Var;
        this.f47330a = n0Var;
        this.f47331b = view;
        this.f47332c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f47333f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ib0 ib0Var;
        q8 q8Var = this.h;
        gg0 gg0Var = q8Var.J;
        gg0Var.setVisibility(4);
        gg0Var.setPaused(true);
        zg.n0 n0Var = this.f47330a;
        if (n0Var != null) {
            n0Var.f49130l = true;
        }
        View view = this.f47331b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f47332c[0];
        if (h1Var != null) {
            h1Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.g3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                q8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f47333f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (ib0Var = launchActivity.f30872x0) != null) {
            ib0Var.c(true);
        }
    }
}
