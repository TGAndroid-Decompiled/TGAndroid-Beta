package org.telegram.ui;

import android.content.Context;
public final class zb1 extends org.telegram.ui.Components.voip.z0 {
    public final fc1 V;

    public zb1(fc1 fc1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.V = fc1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        fc1 fc1Var = this.V;
        fc1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], fc1Var.Y.getMeasuredWidth()};
    }
}
