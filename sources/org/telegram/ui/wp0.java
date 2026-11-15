package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class wp0 extends AnimatorListenerAdapter {
    public final int f52969a;
    public final org.telegram.ui.Components.sk0 f52970b;

    public wp0(org.telegram.ui.Components.sk0 sk0Var, int i7) {
        this.f52969a = i7;
        this.f52970b = sk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52969a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f52970b.f39332b;
                photoViewer.R1.getNextView().setText((CharSequence) null);
                up0 up0Var = photoViewer.U1;
                up0Var.m0 = false;
                if (up0Var.f47800n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) up0Var.f47802p0.getLayoutParams()).topMargin = up0Var.f47800n0;
                    up0Var.f47800n0 = -1;
                    up0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f52970b.f39332b).R1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f52969a) {
            case 0:
                up0 up0Var = ((PhotoViewer) this.f52970b.f39332b).U1;
                Method method = up0Var.f47794g0;
                if (method != null) {
                    try {
                        method.invoke(up0Var, null);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
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
