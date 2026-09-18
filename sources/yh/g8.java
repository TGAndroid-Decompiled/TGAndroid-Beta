package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.hb0;
public final class g8 extends AnimatorListenerAdapter {
    public final zg.m0 f47450a;
    public final View f47451b;
    public final ai.h1[] f47452c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f47453f;
    public final o8 h;

    public g8(o8 o8Var, zg.m0 m0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = o8Var;
        this.f47450a = m0Var;
        this.f47451b = view;
        this.f47452c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f47453f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        hb0 hb0Var;
        o8 o8Var = this.h;
        fg0 fg0Var = o8Var.J;
        fg0Var.setVisibility(4);
        fg0Var.setPaused(true);
        zg.m0 m0Var = this.f47450a;
        if (m0Var != null) {
            m0Var.f49358l = true;
        }
        View view = this.f47451b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f47452c[0];
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
            Runnable runnable = this.f47453f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (hb0Var = launchActivity.f31102x0) != null) {
            hb0Var.c(true);
        }
    }
}
