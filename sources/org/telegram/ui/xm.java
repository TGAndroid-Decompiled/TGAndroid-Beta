package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public abstract class xm extends org.telegram.ui.Components.ml0 implements ai.s9 {
    public final bo X2;

    public xm(bo boVar, Context context, zn znVar) {
        super(context, znVar);
        this.X2 = boVar;
    }

    @Override
    public final void a(int[] iArr) {
        bo boVar = this.X2;
        iArr[0] = ((int) boVar.f32447s9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.w1.z(3.0f, boVar.f32502x0.getPaddingBottom(), boVar.f32502x0.getMeasuredHeight());
    }
}
