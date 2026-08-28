package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class t31 extends AnimatorListenerAdapter {
    public final int f42845a;
    public final org.telegram.ui.Components.pl0 f42846b;

    public t31(org.telegram.ui.Components.pl0 pl0Var, int i9) {
        this.f42845a = i9;
        this.f42846b = pl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42845a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f42846b.f31689b;
                secretMediaViewer.V.getNextView().setText((CharSequence) null);
                zs0 zs0Var = secretMediaViewer.W;
                zs0Var.f40525h0 = false;
                if (zs0Var.f40526i0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) zs0Var.f40528k0.getLayoutParams()).topMargin = zs0Var.f40526i0;
                    zs0Var.f40526i0 = -1;
                    zs0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f42846b.f31689b).V.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42845a) {
            case 0:
                zs0 zs0Var = ((SecretMediaViewer) this.f42846b.f31689b).W;
                Method method = zs0Var.f40519b0;
                if (method != null) {
                    try {
                        method.invoke(zs0Var, null);
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
