package org.telegram.ui;

import android.content.Context;
public final class sb1 extends org.telegram.ui.Components.voip.l0 {
    public final zb1 W;

    public sb1(zb1 zb1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.W = zb1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        zb1 zb1Var = this.W;
        zb1Var.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], zb1Var.Z.getMeasuredWidth()};
    }
}
