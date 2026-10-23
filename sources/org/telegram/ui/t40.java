package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class t40 extends org.telegram.ui.ActionBar.m1 {
    public final u50 f41867o;

    public t40(u50 u50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f41867o = u50Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        u50 u50Var = this.f41867o;
        if (u50Var.f42195f3 != this) {
            return;
        }
        u50Var.f42195f3 = null;
        AnimatorSet animatorSet = u50Var.f42190e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            u50Var.f42190e3 = null;
        }
        u50Var.Y.X = true;
        u50Var.f42190e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(u50Var.W2, org.telegram.ui.Components.t6.f30650b, 0));
        u50Var.f42190e3.playTogether(arrayList);
        u50Var.f42190e3.setDuration(220L);
        u50Var.f42190e3.addListener(new org.telegram.ui.Components.p31(this, 28));
        u50Var.f42190e3.start();
    }
}
