package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class r31 extends AnimatorListenerAdapter {
    public final int f41009a;
    public final org.telegram.ui.Components.gn0 f41010b;

    public r31(org.telegram.ui.Components.gn0 gn0Var, int i10) {
        this.f41009a = i10;
        this.f41010b = gn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41009a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f41010b.f26682b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                kt0 kt0Var = secretMediaViewer.f34086a0;
                kt0Var.f43654l0 = false;
                if (kt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) kt0Var.f43656o0.getLayoutParams()).topMargin = kt0Var.m0;
                    kt0Var.m0 = -1;
                    kt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f41010b.f26682b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41009a) {
            case 0:
                kt0 kt0Var = ((SecretMediaViewer) this.f41010b.f26682b).f34086a0;
                Method method = kt0Var.f43648f0;
                if (method != null) {
                    try {
                        method.invoke(kt0Var, null);
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
