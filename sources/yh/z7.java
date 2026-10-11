package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.db0;
import org.telegram.ui.dg0;
public final class z7 extends AnimatorListenerAdapter {
    public final zg.l0 f53597a;
    public final View f53598b;
    public final ai.h1[] f53599c;
    public final boolean[] d;
    public final RectF f53600e;
    public final Runnable f53601f;
    public final h8 h;

    public z7(h8 h8Var, zg.l0 l0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = h8Var;
        this.f53597a = l0Var;
        this.f53598b = view;
        this.f53599c = h1VarArr;
        this.d = zArr;
        this.f53600e = rectF;
        this.f53601f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        db0 db0Var;
        h8 h8Var = this.h;
        dg0 dg0Var = h8Var.K;
        dg0Var.setVisibility(4);
        dg0Var.setPaused(true);
        zg.l0 l0Var = this.f53597a;
        if (l0Var != null) {
            l0Var.f54717l = true;
        }
        View view = this.f53598b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.f53599c[0];
        if (h1Var != null) {
            h1Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.e3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f53600e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                h8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f53601f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (db0Var = launchActivity.f33883x0) != null) {
            db0Var.c(true);
        }
    }
}
