package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class r41 extends AnimatorListenerAdapter {
    public final int f37183a;
    public final org.telegram.ui.Components.qm0 f37184b;

    public r41(org.telegram.ui.Components.qm0 qm0Var, int i10) {
        this.f37183a = i10;
        this.f37184b = qm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37183a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37184b.f27714b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                tt0 tt0Var = secretMediaViewer.f31724a0;
                tt0Var.f34063l0 = false;
                if (tt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) tt0Var.f34065o0.getLayoutParams()).topMargin = tt0Var.m0;
                    tt0Var.m0 = -1;
                    tt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f37184b.f27714b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37183a) {
            case 0:
                tt0 tt0Var = ((SecretMediaViewer) this.f37184b.f27714b).f31724a0;
                Method method = tt0Var.f34057f0;
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
