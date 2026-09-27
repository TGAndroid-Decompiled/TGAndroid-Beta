package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class yt0 extends AnimatorListenerAdapter {
    public final int f40323a;
    public final org.telegram.ui.Components.sm0 f40324b;

    public yt0(org.telegram.ui.Components.sm0 sm0Var, int i10) {
        this.f40323a = i10;
        this.f40324b = sm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40323a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f40324b.f28338b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                wt0 wt0Var = photoViewer.T1;
                wt0Var.f34859l0 = false;
                if (wt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) wt0Var.f34861o0.getLayoutParams()).topMargin = wt0Var.m0;
                    wt0Var.m0 = -1;
                    wt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f40324b.f28338b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40323a) {
            case 0:
                wt0 wt0Var = ((PhotoViewer) this.f40324b.f28338b).T1;
                Method method = wt0Var.f34853f0;
                if (method != null) {
                    try {
                        method.invoke(wt0Var, null);
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
