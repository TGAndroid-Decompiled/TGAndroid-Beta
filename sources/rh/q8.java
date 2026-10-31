package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w90;
public final class q8 extends AnimatorListenerAdapter {
    public final sg.m0 f47377a;
    public final View f47378b;
    public final th.c0[] f47379c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f47380f;
    public final y8 h;

    public q8(y8 y8Var, sg.m0 m0Var, View view, th.c0[] c0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = y8Var;
        this.f47377a = m0Var;
        this.f47378b = view;
        this.f47379c = c0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f47380f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        w90 w90Var;
        y8 y8Var = this.h;
        kg.h hVar = y8Var.B1;
        hVar.setVisibility(4);
        hVar.setPaused(true);
        sg.m0 m0Var = this.f47377a;
        if (m0Var != null) {
            m0Var.f48404k = true;
        }
        View view = this.f47378b;
        if (view != null) {
            view.invalidate();
        }
        th.c0 c0Var = this.f47379c[0];
        if (c0Var != null) {
            c0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.z2*/.L();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                y8Var.f21589c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f47380f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && (w90Var = launchActivity.f33391x0) != null) {
            w90Var.c(true);
        }
    }
}
