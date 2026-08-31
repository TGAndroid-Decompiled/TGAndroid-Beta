package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public abstract class tm extends org.telegram.ui.Components.tl0 implements oh.a7 {
    public final xn U2;

    public tm(xn xnVar, Context context, vn vnVar) {
        super(context, vnVar);
        this.U2 = xnVar;
    }

    @Override
    public final void a(int[] iArr) {
        xn xnVar = this.U2;
        iArr[0] = ((int) xnVar.f43310p9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.y3.z(3.0f, xnVar.f43362u0.getPaddingBottom(), xnVar.f43362u0.getMeasuredHeight());
    }
}
