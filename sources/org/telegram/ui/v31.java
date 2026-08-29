package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class v31 extends AnimatorListenerAdapter {
    public final int f43414a;
    public final org.telegram.ui.Components.cm0 f43415b;

    public v31(org.telegram.ui.Components.cm0 cm0Var, int i10) {
        this.f43414a = i10;
        this.f43415b = cm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43414a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f43415b.f27510b;
                secretMediaViewer.V.getNextView().setText((CharSequence) null);
                xs0 xs0Var = secretMediaViewer.W;
                xs0Var.f40013h0 = false;
                if (xs0Var.f40014i0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) xs0Var.f40016k0.getLayoutParams()).topMargin = xs0Var.f40014i0;
                    xs0Var.f40014i0 = -1;
                    xs0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f43415b.f27510b).V.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43414a) {
            case 0:
                xs0 xs0Var = ((SecretMediaViewer) this.f43415b.f27510b).W;
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
