package org.telegram.ui;

import android.content.Context;
public final class si1 extends org.telegram.ui.Components.voip.c1 {
    public final zi1 V;

    public si1(zi1 zi1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = zi1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        zi1 zi1Var = this.V;
        zi1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], zi1Var.Y.getMeasuredWidth()};
    }
}
