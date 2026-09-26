package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class r41 extends AnimatorListenerAdapter {
    public final int f37181a;
    public final org.telegram.ui.Components.rm0 f37182b;

    public r41(org.telegram.ui.Components.rm0 rm0Var, int i10) {
        this.f37181a = i10;
        this.f37182b = rm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37181a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37182b.f28009b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                tt0 tt0Var = secretMediaViewer.f31722a0;
                tt0Var.f34061l0 = false;
                if (tt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) tt0Var.f34063o0.getLayoutParams()).topMargin = tt0Var.m0;
                    tt0Var.m0 = -1;
                    tt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f37182b.f28009b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37181a) {
            case 0:
                tt0 tt0Var = ((SecretMediaViewer) this.f37182b.f28009b).f31722a0;
                Method method = tt0Var.f34055f0;
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
