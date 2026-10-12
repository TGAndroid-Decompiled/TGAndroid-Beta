package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fb0;
import org.telegram.ui.fg0;
public final class z7 extends AnimatorListenerAdapter {
    public final zg.l0 f53708a;
    public final View f53709b;
    public final ai.h1[] f53710c;
    public final boolean[] d;
    public final RectF f53711e;
    public final Runnable f53712f;
    public final h8 h;

    public z7(h8 h8Var, zg.l0 l0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = h8Var;
        this.f53708a = l0Var;
        this.f53709b = view;
        this.f53710c = h1VarArr;
        this.d = zArr;
        this.f53711e = rectF;
        this.f53712f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        fb0 fb0Var;
        h8 h8Var = this.h;
        fg0 fg0Var = h8Var.K;
        fg0Var.setVisibility(4);
        fg0Var.setPaused(true);
        zg.l0 l0Var = this.f53708a;
        if (l0Var != null) {
            l0Var.f54828l = true;
        }
        View view = this.f53709b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f53710c[0];
        if (h1Var != null) {
            h1Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.e3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f53711e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                h8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f53712f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (fb0Var = launchActivity.f33660x0) != null) {
            fb0Var.c(true);
        }
    }
}
