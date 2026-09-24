package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class r41 extends AnimatorListenerAdapter {
    public final int f37170a;
    public final org.telegram.ui.Components.qm0 f37171b;

    public r41(org.telegram.ui.Components.qm0 qm0Var, int i10) {
        this.f37170a = i10;
        this.f37171b = qm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37170a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37171b.f27707b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                tt0 tt0Var = secretMediaViewer.f31709a0;
                tt0Var.f34049l0 = false;
                if (tt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) tt0Var.f34051o0.getLayoutParams()).topMargin = tt0Var.m0;
                    tt0Var.m0 = -1;
                    tt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f37171b.f27707b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37170a) {
            case 0:
                tt0 tt0Var = ((SecretMediaViewer) this.f37171b.f27707b).f31709a0;
                Method method = tt0Var.f34043f0;
                if (method != null) {
                    try {
                        method.invoke(tt0Var, null);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
