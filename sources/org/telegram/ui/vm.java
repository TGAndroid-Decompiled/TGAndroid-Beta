package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public abstract class vm extends org.telegram.ui.Components.rl0 implements nh.a7 {
    public final zn U2;

    public vm(zn znVar, Context context, xn xnVar) {
        super(context, xnVar);
        this.U2 = znVar;
    }

    @Override
    public final void a(int[] iArr) {
        zn znVar = this.U2;
        iArr[0] = ((int) znVar.f40707p9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.y3.z(3.0f, znVar.f40759u0.getPaddingBottom(), znVar.f40759u0.getMeasuredHeight());
    }
}
