package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class zs0 extends AnimatorListenerAdapter {
    public final int f45312a;
    public final org.telegram.ui.Components.cm0 f45313b;

    public zs0(org.telegram.ui.Components.cm0 cm0Var, int i10) {
        this.f45312a = i10;
        this.f45313b = cm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45312a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f45313b.f27510b;
                photoViewer.M1.getNextView().setText((CharSequence) null);
                xs0 xs0Var = photoViewer.P1;
                xs0Var.f40013h0 = false;
                if (xs0Var.f40014i0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) xs0Var.f40016k0.getLayoutParams()).topMargin = xs0Var.f40014i0;
                    xs0Var.f40014i0 = -1;
                    xs0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f45313b.f27510b).M1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45312a) {
            case 0:
                xs0 xs0Var = ((PhotoViewer) this.f45313b.f27510b).P1;
                Method method = xs0Var.f40007b0;
                if (method != null) {
                    try {
                        method.invoke(xs0Var, null);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
