package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.db0;
public final class f8 extends AnimatorListenerAdapter {
    public final zg.n0 f47439a;
    public final View f47440b;
    public final ai.h1[] f47441c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f47442f;
    public final n8 h;

    public f8(n8 n8Var, zg.n0 n0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = n8Var;
        this.f47439a = n0Var;
        this.f47440b = view;
        this.f47441c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f47442f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        db0 db0Var;
        n8 n8Var = this.h;
        bg0 bg0Var = n8Var.J;
        bg0Var.setVisibility(4);
        bg0Var.setPaused(true);
        zg.n0 n0Var = this.f47439a;
        if (n0Var != null) {
            n0Var.f49425l = true;
        }
        View view = this.f47440b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f47441c[0];
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
                n8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f47442f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (db0Var = launchActivity.f31146x0) != null) {
            db0Var.c(true);
        }
    }
}
