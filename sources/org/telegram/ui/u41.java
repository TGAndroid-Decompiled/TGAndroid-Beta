package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class u41 extends AnimatorListenerAdapter {
    public final int f38123a;
    public final org.telegram.ui.Components.sm0 f38124b;

    public u41(org.telegram.ui.Components.sm0 sm0Var, int i10) {
        this.f38123a = i10;
        this.f38124b = sm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38123a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38124b.f28338b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                wt0 wt0Var = secretMediaViewer.f31725a0;
                wt0Var.f34859l0 = false;
                if (wt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) wt0Var.f34861o0.getLayoutParams()).topMargin = wt0Var.m0;
                    wt0Var.m0 = -1;
                    wt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f38124b.f28338b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38123a) {
            case 0:
                wt0 wt0Var = ((SecretMediaViewer) this.f38124b.f28338b).f31725a0;
                Method method = wt0Var.f34853f0;
                if (method != null) {
                    try {
                        method.invoke(wt0Var, null);
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
