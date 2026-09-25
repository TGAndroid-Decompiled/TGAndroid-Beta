package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class vt0 extends AnimatorListenerAdapter {
    public final int f38813a;
    public final org.telegram.ui.Components.qm0 f38814b;

    public vt0(org.telegram.ui.Components.qm0 qm0Var, int i10) {
        this.f38813a = i10;
        this.f38814b = qm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38813a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f38814b.f27714b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                tt0 tt0Var = photoViewer.T1;
                tt0Var.f34063l0 = false;
                if (tt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) tt0Var.f34065o0.getLayoutParams()).topMargin = tt0Var.m0;
                    tt0Var.m0 = -1;
                    tt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f38814b.f27714b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38813a) {
            case 0:
                tt0 tt0Var = ((PhotoViewer) this.f38814b.f27714b).T1;
                Method method = tt0Var.f34057f0;
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
