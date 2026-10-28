package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class x40 extends org.telegram.ui.ActionBar.o1 {
    public final x50 f45473o;

    public x40(x50 x50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f45473o = x50Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        x50 x50Var = this.f45473o;
        if (x50Var.f45515f3 != this) {
            return;
        }
        x50Var.f45515f3 = null;
        AnimatorSet animatorSet = x50Var.f45510e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            x50Var.f45510e3 = null;
        }
        x50Var.Y.X = true;
        x50Var.f45510e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(x50Var.W2, org.telegram.ui.Components.v6.f33570b, 0));
        x50Var.f45510e3.playTogether(arrayList);
        x50Var.f45510e3.setDuration(220L);
        x50Var.f45510e3.addListener(new org.telegram.ui.Components.i31(this, 29));
        x50Var.f45510e3.start();
    }
}
