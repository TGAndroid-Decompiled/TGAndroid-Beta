package org.telegram.ui;

import android.content.Context;
public final class th1 extends org.telegram.ui.Components.voip.a1 {
    public final ai1 S;

    public th1(ai1 ai1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.S = ai1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ai1 ai1Var = this.S;
        ai1Var.V.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ai1Var.V.getMeasuredWidth()};
    }
}
