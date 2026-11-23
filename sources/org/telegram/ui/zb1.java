package org.telegram.ui;

import android.content.Context;
public final class zb1 extends org.telegram.ui.Components.voip.d1 {
    public final fc1 W;

    public zb1(fc1 fc1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.W = fc1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        fc1 fc1Var = this.W;
        fc1Var.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], fc1Var.Z.getMeasuredWidth()};
    }
}
