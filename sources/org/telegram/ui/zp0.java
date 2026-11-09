package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class zp0 extends AnimatorListenerAdapter {
    public final int f52644a;
    public final org.telegram.ui.Components.ok0 f52645b;

    public zp0(org.telegram.ui.Components.ok0 ok0Var, int i7) {
        this.f52644a = i7;
        this.f52645b = ok0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52644a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f52645b.f36738b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                xp0 xp0Var = photoViewer.T1;
                xp0Var.f47350l0 = false;
                if (xp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) xp0Var.f47352o0.getLayoutParams()).topMargin = xp0Var.m0;
                    xp0Var.m0 = -1;
                    xp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f52645b.f36738b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f52644a) {
            case 0:
                xp0 xp0Var = ((PhotoViewer) this.f52645b.f36738b).T1;
                Method method = xp0Var.f47344f0;
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
