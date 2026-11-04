package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class zy0 extends AnimatorListenerAdapter {
    public final int f52764a;
    public final org.telegram.ui.Components.rk0 f52765b;

    public zy0(org.telegram.ui.Components.rk0 rk0Var, int i3) {
        this.f52764a = i3;
        this.f52765b = rk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52764a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f52765b.f37747b;
                secretMediaViewer.Y.getNextView().setText((CharSequence) null);
                mp0 mp0Var = secretMediaViewer.Z;
                mp0Var.m0 = false;
                if (mp0Var.f52736n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) mp0Var.f52738p0.getLayoutParams()).topMargin = mp0Var.f52736n0;
                    mp0Var.f52736n0 = -1;
                    mp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f52765b.f37747b).Y.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f52764a) {
            case 0:
                mp0 mp0Var = ((SecretMediaViewer) this.f52765b.f37747b).Z;
                Method method = mp0Var.f52730g0;
                if (method != null) {
                    try {
                        method.invoke(mp0Var, null);
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
