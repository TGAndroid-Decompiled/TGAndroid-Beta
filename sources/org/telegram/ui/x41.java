package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class x41 extends AnimatorListenerAdapter {
    public final int f39490a;
    public final org.telegram.ui.Components.em0 f39491b;

    public x41(org.telegram.ui.Components.em0 em0Var, int i10) {
        this.f39490a = i10;
        this.f39491b = em0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39490a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39491b.f23694b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                bu0 bu0Var = secretMediaViewer.f31437a0;
                bu0Var.f36351l0 = false;
                if (bu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) bu0Var.f36353o0.getLayoutParams()).topMargin = bu0Var.m0;
                    bu0Var.m0 = -1;
                    bu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f39491b.f23694b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39490a) {
            case 0:
                bu0 bu0Var = ((SecretMediaViewer) this.f39491b.f23694b).f31437a0;
                Method method = bu0Var.f36345f0;
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
