package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class yt0 extends AnimatorListenerAdapter {
    public final int f43624a;
    public final org.telegram.ui.Components.wm0 f43625b;

    public yt0(org.telegram.ui.Components.wm0 wm0Var, int i10) {
        this.f43624a = i10;
        this.f43625b = wm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43624a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f43625b.f32589b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                wt0 wt0Var = photoViewer.T1;
                wt0Var.f37770l0 = false;
                if (wt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) wt0Var.f37772o0.getLayoutParams()).topMargin = wt0Var.m0;
                    wt0Var.m0 = -1;
                    wt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f43625b.f32589b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43624a) {
            case 0:
                wt0 wt0Var = ((PhotoViewer) this.f43625b.f32589b).T1;
                Method method = wt0Var.f37764f0;
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
