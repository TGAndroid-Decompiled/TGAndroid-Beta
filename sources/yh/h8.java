package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cg0;
import org.telegram.ui.eb0;
public final class h8 extends AnimatorListenerAdapter {
    public final zg.m0 f51399a;
    public final View f51400b;
    public final ai.h1[] f51401c;
    public final boolean[] d;
    public final RectF f51402e;
    public final Runnable f51403f;
    public final p8 h;

    public h8(p8 p8Var, zg.m0 m0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = p8Var;
        this.f51399a = m0Var;
        this.f51400b = view;
        this.f51401c = h1VarArr;
        this.d = zArr;
        this.f51402e = rectF;
        this.f51403f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        eb0 eb0Var;
        p8 p8Var = this.h;
        cg0 cg0Var = p8Var.J;
        cg0Var.setVisibility(4);
        cg0Var.setPaused(true);
        zg.m0 m0Var = this.f51399a;
        if (m0Var != null) {
            m0Var.f53465l = true;
        }
        View view = this.f51400b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f51401c[0];
        if (h1Var != null) {
            h1Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f51402e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                p8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f51403f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (eb0Var = launchActivity.f33818x0) != null) {
            eb0Var.c(true);
        }
    }
}
