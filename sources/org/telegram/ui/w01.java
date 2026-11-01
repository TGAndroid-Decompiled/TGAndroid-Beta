package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class w01 extends AnimatorListenerAdapter {
    public final int f42646a;
    public final org.telegram.ui.Components.sl0 f42647b;

    public w01(org.telegram.ui.Components.sl0 sl0Var, int i10) {
        this.f42646a = i10;
        this.f42647b = sl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42646a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f42647b.f30331b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                dr0 dr0Var = secretMediaViewer.Y;
                dr0Var.f41452l0 = false;
                if (dr0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) dr0Var.f41454o0.getLayoutParams()).topMargin = dr0Var.m0;
                    dr0Var.m0 = -1;
                    dr0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f42647b.f30331b).X.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42646a) {
            case 0:
                dr0 dr0Var = ((SecretMediaViewer) this.f42647b.f30331b).Y;
                Method method = dr0Var.f41446f0;
                if (method != null) {
                    try {
                        method.invoke(dr0Var, null);
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
