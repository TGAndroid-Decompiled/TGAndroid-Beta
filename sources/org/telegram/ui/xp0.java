package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class xp0 extends AnimatorListenerAdapter {
    public final int f51958a;
    public final org.telegram.ui.Components.nk0 f51959b;

    public xp0(org.telegram.ui.Components.nk0 nk0Var, int i7) {
        this.f51958a = i7;
        this.f51959b = nk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51958a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f51959b.f36327b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                vp0 vp0Var = photoViewer.T1;
                vp0Var.f46727l0 = false;
                if (vp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) vp0Var.f46729o0.getLayoutParams()).topMargin = vp0Var.m0;
                    vp0Var.m0 = -1;
                    vp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f51959b.f36327b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f51958a) {
            case 0:
                vp0 vp0Var = ((PhotoViewer) this.f51959b.f36327b).T1;
                Method method = vp0Var.f46721f0;
                if (method != null) {
                    try {
                        method.invoke(vp0Var, null);
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
