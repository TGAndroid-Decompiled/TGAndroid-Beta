package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class v40 extends org.telegram.ui.ActionBar.o1 {
    public final v50 f44604o;

    public v40(v50 v50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f44604o = v50Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        v50 v50Var = this.f44604o;
        if (v50Var.f44634f3 != this) {
            return;
        }
        v50Var.f44634f3 = null;
        AnimatorSet animatorSet = v50Var.f44629e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            v50Var.f44629e3 = null;
        }
        v50Var.Y.X = true;
        v50Var.f44629e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(v50Var.W2, org.telegram.ui.Components.v6.f33580b, 0));
        v50Var.f44629e3.playTogether(arrayList);
        v50Var.f44629e3.setDuration(220L);
        v50Var.f44629e3.addListener(new org.telegram.ui.Components.h31(this, 29));
        v50Var.f44629e3.start();
    }
}
