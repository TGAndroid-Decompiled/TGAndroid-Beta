package org.telegram.ui;

import android.content.Context;
public final class sd1 extends org.telegram.ui.Components.voip.m0 {
    public final zd1 V;

    public sd1(zd1 zd1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = zd1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        zd1 zd1Var = this.V;
        zd1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], zd1Var.Y.getMeasuredWidth()};
    }
}
