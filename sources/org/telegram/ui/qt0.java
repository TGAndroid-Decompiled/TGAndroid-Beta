package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class qt0 extends AnimatorListenerAdapter {
    public final int f42913a;
    public final org.telegram.ui.Components.ln0 f42914b;

    public qt0(org.telegram.ui.Components.ln0 ln0Var, int i10) {
        this.f42913a = i10;
        this.f42914b = ln0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42913a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f42914b.f30232b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                ot0 ot0Var = photoViewer.T1;
                ot0Var.f38168l0 = false;
                if (ot0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ot0Var.f38170o0.getLayoutParams()).topMargin = ot0Var.m0;
                    ot0Var.m0 = -1;
                    ot0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f42914b.f30232b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42913a) {
            case 0:
                ot0 ot0Var = ((PhotoViewer) this.f42914b.f30232b).T1;
                Method method = ot0Var.f38162f0;
                if (method != null) {
                    try {
                        method.invoke(ot0Var, null);
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
