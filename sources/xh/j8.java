package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.gb0;
public final class j8 extends AnimatorListenerAdapter {
    public final yg.n0 f45603a;
    public final View f45604b;
    public final zh.f0[] f45605c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f45606f;
    public final r8 h;

    public j8(r8 r8Var, yg.n0 n0Var, View view, zh.f0[] f0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = r8Var;
        this.f45603a = n0Var;
        this.f45604b = view;
        this.f45605c = f0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f45606f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        gb0 gb0Var;
        r8 r8Var = this.h;
        eg0 eg0Var = r8Var.J;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        yg.n0 n0Var = this.f45603a;
        if (n0Var != null) {
            n0Var.f47082l = true;
        }
        View view = this.f45604b;
        if (view != null) {
            view.invalidate();
        }
        zh.f0 f0Var = this.f45605c[0];
        if (f0Var != null) {
            f0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.h3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                r8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f45606f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (gb0Var = launchActivity.f29971x0) != null) {
            gb0Var.c(true);
        }
    }
}
