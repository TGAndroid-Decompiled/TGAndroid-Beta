package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.gb0;
public final class i8 extends AnimatorListenerAdapter {
    public final zg.n0 f47307a;
    public final View f47308b;
    public final ai.h1[] f47309c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f47310f;
    public final q8 h;

    public i8(q8 q8Var, zg.n0 n0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = q8Var;
        this.f47307a = n0Var;
        this.f47308b = view;
        this.f47309c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f47310f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        gb0 gb0Var;
        q8 q8Var = this.h;
        eg0 eg0Var = q8Var.J;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        zg.n0 n0Var = this.f47307a;
        if (n0Var != null) {
            n0Var.f49107l = true;
        }
        View view = this.f47308b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f47309c[0];
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
                q8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f47310f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (gb0Var = launchActivity.f30858x0) != null) {
            gb0Var.c(true);
        }
    }
}
