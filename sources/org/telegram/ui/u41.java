package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class u41 extends AnimatorListenerAdapter {
    public final int f41046a;
    public final org.telegram.ui.Components.wm0 f41047b;

    public u41(org.telegram.ui.Components.wm0 wm0Var, int i10) {
        this.f41046a = i10;
        this.f41047b = wm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41046a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f41047b.f32582b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                wt0 wt0Var = secretMediaViewer.f34403a0;
                wt0Var.f37764l0 = false;
                if (wt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) wt0Var.f37766o0.getLayoutParams()).topMargin = wt0Var.m0;
                    wt0Var.m0 = -1;
                    wt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f41047b.f32582b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41046a) {
            case 0:
                wt0 wt0Var = ((SecretMediaViewer) this.f41047b.f32582b).f34403a0;
                Method method = wt0Var.f37758f0;
                if (method != null) {
                    try {
                        method.invoke(wt0Var, null);
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
