package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class w01 extends AnimatorListenerAdapter {
    public final int f42847a;
    public final org.telegram.ui.Components.rl0 f42848b;

    public w01(org.telegram.ui.Components.rl0 rl0Var, int i10) {
        this.f42847a = i10;
        this.f42848b = rl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42847a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f42848b.f29952b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                fr0 fr0Var = secretMediaViewer.Y;
                fr0Var.f41929l0 = false;
                if (fr0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) fr0Var.f41931o0.getLayoutParams()).topMargin = fr0Var.m0;
                    fr0Var.m0 = -1;
                    fr0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f42848b.f29952b).X.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42847a) {
            case 0:
                fr0 fr0Var = ((SecretMediaViewer) this.f42848b.f29952b).Y;
                Method method = fr0Var.f41923f0;
                if (method != null) {
                    try {
                        method.invoke(fr0Var, null);
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
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
