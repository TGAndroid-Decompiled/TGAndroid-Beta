package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class wt0 extends AnimatorListenerAdapter {
    public final int f39087a;
    public final org.telegram.ui.Components.fm0 f39088b;

    public wt0(org.telegram.ui.Components.fm0 fm0Var, int i10) {
        this.f39087a = i10;
        this.f39088b = fm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39087a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f39088b.f24009b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                ut0 ut0Var = photoViewer.T1;
                ut0Var.f33929l0 = false;
                if (ut0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ut0Var.f33931o0.getLayoutParams()).topMargin = ut0Var.m0;
                    ut0Var.m0 = -1;
                    ut0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f39088b.f24009b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39087a) {
            case 0:
                ut0 ut0Var = ((PhotoViewer) this.f39088b.f24009b).T1;
                Method method = ut0Var.f33923f0;
                if (method != null) {
                    try {
                        method.invoke(ut0Var, null);
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
