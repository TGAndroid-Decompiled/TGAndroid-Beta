package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public abstract class vm extends org.telegram.ui.Components.yl0 implements ai.s9 {
    public final zn X2;

    public vm(zn znVar, Context context, xn xnVar) {
        super(context, xnVar);
        this.X2 = znVar;
    }

    @Override
    public final void a(int[] iArr) {
        zn znVar = this.X2;
        iArr[0] = ((int) znVar.f40496s9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.l0.A(3.0f, znVar.f40551x0.getPaddingBottom(), znVar.f40551x0.getMeasuredHeight());
    }
}
