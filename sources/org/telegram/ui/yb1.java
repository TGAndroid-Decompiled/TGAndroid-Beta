package org.telegram.ui;

import android.content.Context;
public final class yb1 extends org.telegram.ui.Components.voip.z0 {
    public final ec1 V;

    public yb1(ec1 ec1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.V = ec1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ec1 ec1Var = this.V;
        ec1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ec1Var.Y.getMeasuredWidth()};
    }
}
