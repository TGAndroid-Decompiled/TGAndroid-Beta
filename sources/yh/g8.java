package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gg0;
import org.telegram.ui.ib0;
public final class g8 extends AnimatorListenerAdapter {
    public final zg.n0 f47515a;
    public final View f47516b;
    public final ai.h1[] f47517c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f47518f;
    public final o8 h;

    public g8(o8 o8Var, zg.n0 n0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = o8Var;
        this.f47515a = n0Var;
        this.f47516b = view;
        this.f47517c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f47518f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ib0 ib0Var;
        o8 o8Var = this.h;
        gg0 gg0Var = o8Var.J;
        gg0Var.setVisibility(4);
        gg0Var.setPaused(true);
        zg.n0 n0Var = this.f47515a;
        if (n0Var != null) {
            n0Var.f49427l = true;
        }
        View view = this.f47516b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f47517c[0];
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
            Runnable runnable = this.f47518f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (ib0Var = launchActivity.f31163x0) != null) {
            ib0Var.c(true);
        }
    }
}
