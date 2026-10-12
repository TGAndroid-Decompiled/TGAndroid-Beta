package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.fb0;
public final class z7 extends AnimatorListenerAdapter {
    public final zg.l0 f53700a;
    public final View f53701b;
    public final ai.h1[] f53702c;
    public final boolean[] d;
    public final RectF f53703e;
    public final Runnable f53704f;
    public final h8 h;

    public z7(h8 h8Var, zg.l0 l0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = h8Var;
        this.f53700a = l0Var;
        this.f53701b = view;
        this.f53702c = h1VarArr;
        this.d = zArr;
        this.f53703e = rectF;
        this.f53704f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        fb0 fb0Var;
        h8 h8Var = this.h;
        eg0 eg0Var = h8Var.K;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        zg.l0 l0Var = this.f53700a;
        if (l0Var != null) {
            l0Var.f54820l = true;
        }
        View view = this.f53701b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f53702c[0];
        if (h1Var != null) {
            h1Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.e3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f53703e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                h8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f53704f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (fb0Var = launchActivity.f33658x0) != null) {
            fb0Var.c(true);
        }
    }
}
