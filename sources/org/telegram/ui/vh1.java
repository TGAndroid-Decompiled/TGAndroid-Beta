package org.telegram.ui;

import android.content.Context;
public final class vh1 extends org.telegram.ui.Components.voip.b1 {
    public final ci1 S;

    public vh1(ci1 ci1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.S = ci1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ci1 ci1Var = this.S;
        ci1Var.V.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ci1Var.V.getMeasuredWidth()};
    }
}
