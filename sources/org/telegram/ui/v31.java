package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class v31 extends AnimatorListenerAdapter {
    public final int f44177a;
    public final org.telegram.ui.Components.mn0 f44178b;

    public v31(org.telegram.ui.Components.mn0 mn0Var, int i10) {
        this.f44177a = i10;
        this.f44178b = mn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44177a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f44178b.f30564b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                qt0 qt0Var = secretMediaViewer.f36176a0;
                qt0Var.f38688l0 = false;
                if (qt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) qt0Var.f38690o0.getLayoutParams()).topMargin = qt0Var.m0;
                    qt0Var.m0 = -1;
                    qt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f44178b.f30564b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44177a) {
            case 0:
                qt0 qt0Var = ((SecretMediaViewer) this.f44178b.f30564b).f36176a0;
                Method method = qt0Var.f38682f0;
                if (method != null) {
                    try {
                        method.invoke(qt0Var, null);
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
