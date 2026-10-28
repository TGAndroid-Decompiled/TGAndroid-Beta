package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class st0 extends AnimatorListenerAdapter {
    public final int f43403a;
    public final org.telegram.ui.Components.mn0 f43404b;

    public st0(org.telegram.ui.Components.mn0 mn0Var, int i10) {
        this.f43403a = i10;
        this.f43404b = mn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43403a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f43404b.f30564b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                qt0 qt0Var = photoViewer.T1;
                qt0Var.f38688l0 = false;
                if (qt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) qt0Var.f38690o0.getLayoutParams()).topMargin = qt0Var.m0;
                    qt0Var.m0 = -1;
                    qt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f43404b.f30564b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43403a) {
            case 0:
                qt0 qt0Var = ((PhotoViewer) this.f43404b.f30564b).T1;
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
