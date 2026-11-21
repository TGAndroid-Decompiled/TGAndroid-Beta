package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class yp0 extends AnimatorListenerAdapter {
    public final int f54267a;
    public final org.telegram.ui.Components.cl0 f54268b;

    public yp0(org.telegram.ui.Components.cl0 cl0Var, int i7) {
        this.f54267a = i7;
        this.f54268b = cl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54267a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f54268b.f34222b;
                photoViewer.R1.getNextView().setText((CharSequence) null);
                wp0 wp0Var = photoViewer.U1;
                wp0Var.m0 = false;
                if (wp0Var.f49076n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) wp0Var.f49078p0.getLayoutParams()).topMargin = wp0Var.f49076n0;
                    wp0Var.f49076n0 = -1;
                    wp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f54268b.f34222b).R1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f54267a) {
            case 0:
                wp0 wp0Var = ((PhotoViewer) this.f54268b.f34222b).U1;
                Method method = wp0Var.f49070g0;
                if (method != null) {
                    try {
                        method.invoke(wp0Var, null);
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
