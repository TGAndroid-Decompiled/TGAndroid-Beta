package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public abstract class ym extends org.telegram.ui.Components.ll0 implements bi.b9 {
    public final co X2;

    public ym(co coVar, Context context, ao aoVar) {
        super(context, aoVar);
        this.X2 = coVar;
    }

    @Override
    public final void a(int[] iArr) {
        co coVar = this.X2;
        iArr[0] = ((int) coVar.f35418s9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.w1.z(3.0f, coVar.f35473x0.getPaddingBottom(), coVar.f35473x0.getMeasuredHeight());
    }
}
