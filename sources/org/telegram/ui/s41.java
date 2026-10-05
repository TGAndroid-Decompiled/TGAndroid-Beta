package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class s41 extends AnimatorListenerAdapter {
    public final int f40333a;
    public final org.telegram.ui.Components.wm0 f40334b;

    public s41(org.telegram.ui.Components.wm0 wm0Var, int i10) {
        this.f40333a = i10;
        this.f40334b = wm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40333a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40334b.f32671b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                wt0 wt0Var = secretMediaViewer.f34423a0;
                wt0Var.f37778l0 = false;
                if (wt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) wt0Var.f37780o0.getLayoutParams()).topMargin = wt0Var.m0;
                    wt0Var.m0 = -1;
                    wt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f40334b.f32671b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40333a) {
            case 0:
                wt0 wt0Var = ((SecretMediaViewer) this.f40334b.f32671b).f34423a0;
                Method method = wt0Var.f37772f0;
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
