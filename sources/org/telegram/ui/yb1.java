package org.telegram.ui;

import android.content.Context;
public final class yb1 extends org.telegram.ui.Components.voip.d1 {
    public final ec1 W;

    public yb1(ec1 ec1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.W = ec1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ec1 ec1Var = this.W;
        ec1Var.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ec1Var.Z.getMeasuredWidth()};
    }
}
