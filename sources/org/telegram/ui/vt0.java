package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class vt0 extends AnimatorListenerAdapter {
    public final int f38812a;
    public final org.telegram.ui.Components.sm0 f38813b;

    public vt0(org.telegram.ui.Components.sm0 sm0Var, int i10) {
        this.f38812a = i10;
        this.f38813b = sm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38812a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f38813b.f28318b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                tt0 tt0Var = photoViewer.T1;
                tt0Var.f34065l0 = false;
                if (tt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) tt0Var.f34067o0.getLayoutParams()).topMargin = tt0Var.m0;
                    tt0Var.m0 = -1;
                    tt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f38813b.f28318b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38812a) {
            case 0:
                tt0 tt0Var = ((PhotoViewer) this.f38813b.f28318b).T1;
                Method method = tt0Var.f34059f0;
                if (method != null) {
                    try {
                        method.invoke(tt0Var, null);
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
