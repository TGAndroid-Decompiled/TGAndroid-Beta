package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.gb0;
public final class h8 extends AnimatorListenerAdapter {
    public final zg.n0 f47206a;
    public final View f47207b;
    public final ai.h1[] f47208c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f47209f;
    public final p8 h;

    public h8(p8 p8Var, zg.n0 n0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = p8Var;
        this.f47206a = n0Var;
        this.f47207b = view;
        this.f47208c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f47209f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        gb0 gb0Var;
        p8 p8Var = this.h;
        eg0 eg0Var = p8Var.J;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        zg.n0 n0Var = this.f47206a;
        if (n0Var != null) {
            n0Var.f49100l = true;
        }
        View view = this.f47207b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f47208c[0];
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
                p8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f47209f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (gb0Var = launchActivity.f30855x0) != null) {
            gb0Var.c(true);
        }
    }
}
