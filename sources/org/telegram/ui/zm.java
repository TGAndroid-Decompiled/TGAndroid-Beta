package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public abstract class zm extends org.telegram.ui.Components.vl0 implements zh.q5 {
    public final eo X2;

    public zm(eo eoVar, Context context, bo boVar) {
        super(context, boVar);
        this.X2 = eoVar;
    }

    @Override
    public final void a(int[] iArr) {
        eo eoVar = this.X2;
        iArr[0] = ((int) eoVar.f32487s9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.a2.z(3.0f, eoVar.f32542x0.getPaddingBottom(), eoVar.f32542x0.getMeasuredHeight());
    }
}
