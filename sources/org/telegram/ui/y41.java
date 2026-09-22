package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class y41 extends AnimatorListenerAdapter {
    public final int f39757a;
    public final org.telegram.ui.Components.em0 f39758b;

    public y41(org.telegram.ui.Components.em0 em0Var, int i10) {
        this.f39757a = i10;
        this.f39758b = em0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39757a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39758b.f23691b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                bu0 bu0Var = secretMediaViewer.f31434a0;
                bu0Var.f36354l0 = false;
                if (bu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) bu0Var.f36356o0.getLayoutParams()).topMargin = bu0Var.m0;
                    bu0Var.m0 = -1;
                    bu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f39758b.f23691b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39757a) {
            case 0:
                bu0 bu0Var = ((SecretMediaViewer) this.f39758b.f23691b).f31434a0;
                Method method = bu0Var.f36348f0;
                if (method != null) {
                    try {
                        method.invoke(bu0Var, null);
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
