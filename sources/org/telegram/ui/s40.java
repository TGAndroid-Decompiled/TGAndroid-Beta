package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class s40 extends org.telegram.ui.ActionBar.n1 {

    public final s50 f42404o;

    public s40(s50 s50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f42404o = s50Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        s50 s50Var = this.f42404o;
        if (s50Var.f42416b3 != this) {
            return;
        }
        s50Var.f42416b3 = null;
        AnimatorSet animatorSet = s50Var.a3;
        if (animatorSet != null) {
            animatorSet.cancel();
            s50Var.a3 = null;
        }
        s50Var.U.X = true;
        s50Var.a3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(s50Var.S2, org.telegram.ui.Components.m6.f30579b, 0));
        s50Var.a3.playTogether(arrayList);
        s50Var.a3.setDuration(220L);
        s50Var.a3.addListener(new org.telegram.ui.Components.f11(this, 29));
        s50Var.a3.start();
    }
}
