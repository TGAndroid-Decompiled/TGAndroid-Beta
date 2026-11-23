package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class zp0 extends AnimatorListenerAdapter {
    public final int f54579a;
    public final org.telegram.ui.Components.cl0 f54580b;

    public zp0(org.telegram.ui.Components.cl0 cl0Var, int i7) {
        this.f54579a = i7;
        this.f54580b = cl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54579a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f54580b.f34184b;
                photoViewer.R1.getNextView().setText((CharSequence) null);
                xp0 xp0Var = photoViewer.U1;
                xp0Var.m0 = false;
                if (xp0Var.f49341n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) xp0Var.f49343p0.getLayoutParams()).topMargin = xp0Var.f49341n0;
                    xp0Var.f49341n0 = -1;
                    xp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f54580b.f34184b).R1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f54579a) {
            case 0:
                xp0 xp0Var = ((PhotoViewer) this.f54580b.f34184b).U1;
                Method method = xp0Var.f49335g0;
                if (method != null) {
                    try {
                        method.invoke(xp0Var, null);
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
