package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class r40 extends org.telegram.ui.ActionBar.o1 {
    public final r50 f41864o;

    public r40(r50 r50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f41864o = r50Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        r50 r50Var = this.f41864o;
        if (r50Var.f41875b3 != this) {
            return;
        }
        r50Var.f41875b3 = null;
        AnimatorSet animatorSet = r50Var.f41870a3;
        if (animatorSet != null) {
            animatorSet.cancel();
            r50Var.f41870a3 = null;
        }
        r50Var.U.X = true;
        r50Var.f41870a3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(r50Var.S2, org.telegram.ui.Components.r6.f32221b, 0));
        r50Var.f41870a3.playTogether(arrayList);
        r50Var.f41870a3.setDuration(220L);
        r50Var.f41870a3.addListener(new org.telegram.ui.Components.p11(this, 29));
        r50Var.f41870a3.start();
    }
}
