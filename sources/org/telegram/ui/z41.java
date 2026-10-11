package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class z41 extends AnimatorListenerAdapter {
    public final int f44579a;
    public final org.telegram.ui.Components.mn0 f44580b;

    public z41(org.telegram.ui.Components.mn0 mn0Var, int i10) {
        this.f44579a = i10;
        this.f44580b = mn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44579a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f44580b.f28805b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                bu0 bu0Var = secretMediaViewer.f34441a0;
                bu0Var.f40622l0 = false;
                if (bu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) bu0Var.f40624o0.getLayoutParams()).topMargin = bu0Var.m0;
                    bu0Var.m0 = -1;
                    bu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f44580b.f28805b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44579a) {
            case 0:
                bu0 bu0Var = ((SecretMediaViewer) this.f44580b.f28805b).f34441a0;
                Method method = bu0Var.f40616f0;
                if (method != null) {
                    try {
                        method.invoke(bu0Var, null);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
