package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class s31 extends AnimatorListenerAdapter {
    public final int f43348a;
    public final org.telegram.ui.Components.ln0 f43349b;

    public s31(org.telegram.ui.Components.ln0 ln0Var, int i10) {
        this.f43348a = i10;
        this.f43349b = ln0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43348a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f43349b.f30232b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                ot0 ot0Var = secretMediaViewer.f36149a0;
                ot0Var.f38168l0 = false;
                if (ot0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ot0Var.f38170o0.getLayoutParams()).topMargin = ot0Var.m0;
                    ot0Var.m0 = -1;
                    ot0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f43349b.f30232b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43348a) {
            case 0:
                ot0 ot0Var = ((SecretMediaViewer) this.f43349b.f30232b).f36149a0;
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
