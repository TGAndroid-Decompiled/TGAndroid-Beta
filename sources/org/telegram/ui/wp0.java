package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class wp0 extends AnimatorListenerAdapter {
    public final int f51467a;
    public final org.telegram.ui.Components.nk0 f51468b;

    public wp0(org.telegram.ui.Components.nk0 nk0Var, int i7) {
        this.f51467a = i7;
        this.f51468b = nk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51467a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f51468b.f36433b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                up0 up0Var = photoViewer.T1;
                up0Var.f46468l0 = false;
                if (up0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) up0Var.f46470o0.getLayoutParams()).topMargin = up0Var.m0;
                    up0Var.m0 = -1;
                    up0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f51468b.f36433b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f51467a) {
            case 0:
                up0 up0Var = ((PhotoViewer) this.f51468b.f36433b).T1;
                Method method = up0Var.f46462f0;
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
