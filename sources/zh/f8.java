package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.gb0;
public final class f8 extends AnimatorListenerAdapter {
    public final ah.h1 f51927a;
    public final View f51928b;
    public final bi.z0[] f51929c;
    public final boolean[] d;
    public final RectF f51930e;
    public final Runnable f51931f;
    public final n8 h;

    public f8(n8 n8Var, ah.h1 h1Var, View view, bi.z0[] z0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = n8Var;
        this.f51927a = h1Var;
        this.f51928b = view;
        this.f51929c = z0VarArr;
        this.d = zArr;
        this.f51930e = rectF;
        this.f51931f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        gb0 gb0Var;
        n8 n8Var = this.h;
        eg0 eg0Var = n8Var.J;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        ah.h1 h1Var = this.f51927a;
        if (h1Var != null) {
            h1Var.f580l = true;
        }
        View view = this.f51928b;
        if (view != null) {
            view.invalidate();
        }
        bi.z0 z0Var = this.f51929c[0];
        if (z0Var != null) {
            z0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f51930e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                n8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f51931f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (gb0Var = launchActivity.f33494x0) != null) {
            gb0Var.c(true);
        }
    }
}
