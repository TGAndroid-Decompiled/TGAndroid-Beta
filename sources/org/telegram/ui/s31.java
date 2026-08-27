package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

public final class s31 extends AnimatorListenerAdapter {

    public final int f42402a;

    public final org.telegram.ui.Components.sl0 f42403b;

    public s31(org.telegram.ui.Components.sl0 sl0Var, int i10) {
        this.f42402a = i10;
        this.f42403b = sl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42402a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f42403b.f32482b;
                secretMediaViewer.V.getNextView().setText((CharSequence) null);
                at0 at0Var = secretMediaViewer.W;
                at0Var.f40925h0 = false;
                if (at0Var.f40926i0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) at0Var.f40928k0.getLayoutParams()).topMargin = at0Var.f40926i0;
                    at0Var.f40926i0 = -1;
                    at0Var.requestLayout();
                }
                break;
            default:
                ((SecretMediaViewer) this.f42403b.f32482b).V.setTranslationY(0.0f);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42402a) {
            case 0:
                at0 at0Var = ((SecretMediaViewer) this.f42403b.f32482b).W;
                Method method = at0Var.f40919b0;
                if (method != null) {
                    try {
                        method.invoke(at0Var, null);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
