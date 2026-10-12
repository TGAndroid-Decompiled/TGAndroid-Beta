package org.telegram.ui;

import android.content.Context;
public final class wi1 extends org.telegram.ui.Components.voip.b1 {
    public final dj1 V;

    public wi1(dj1 dj1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = dj1Var;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        dj1 dj1Var = this.V;
        dj1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], dj1Var.Y.getMeasuredWidth()};
    }
}
