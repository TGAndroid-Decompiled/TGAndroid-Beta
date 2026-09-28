package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ab0;
import org.telegram.ui.yf0;
public final class g8 extends AnimatorListenerAdapter {
    public final zg.m0 f47458a;
    public final View f47459b;
    public final ai.h1[] f47460c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f47461f;
    public final o8 h;

    public g8(o8 o8Var, zg.m0 m0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = o8Var;
        this.f47458a = m0Var;
        this.f47459b = view;
        this.f47460c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f47461f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ab0 ab0Var;
        o8 o8Var = this.h;
        yf0 yf0Var = o8Var.J;
        yf0Var.setVisibility(4);
        yf0Var.setPaused(true);
        zg.m0 m0Var = this.f47458a;
        if (m0Var != null) {
            m0Var.f49378l = true;
        }
        View view = this.f47459b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f47460c[0];
        if (h1Var != null) {
            h1Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.e3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                o8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f47461f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (ab0Var = launchActivity.f31145x0) != null) {
            ab0Var.c(true);
        }
    }
}
