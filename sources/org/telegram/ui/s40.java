package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class s40 extends org.telegram.ui.ActionBar.m1 {
    public final s50 f40890o;

    public s40(s50 s50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f40890o = s50Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        s50 s50Var = this.f40890o;
        if (s50Var.f40920f3 != this) {
            return;
        }
        s50Var.f40920f3 = null;
        AnimatorSet animatorSet = s50Var.f40915e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            s50Var.f40915e3 = null;
        }
        s50Var.Y.X = true;
        s50Var.f40915e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(s50Var.W2, org.telegram.ui.Components.t6.f30472b, 0));
        s50Var.f40915e3.playTogether(arrayList);
        s50Var.f40915e3.setDuration(220L);
        s50Var.f40915e3.addListener(new org.telegram.ui.Components.n31(this, 27));
        s50Var.f40915e3.start();
    }
}
