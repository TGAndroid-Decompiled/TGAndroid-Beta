package org.telegram.ui;

import android.content.Context;
public final class vi1 extends org.telegram.ui.Components.voip.b1 {
    public final cj1 V;

    public vi1(cj1 cj1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = cj1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        cj1 cj1Var = this.V;
        cj1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], cj1Var.Y.getMeasuredWidth()};
    }
}
