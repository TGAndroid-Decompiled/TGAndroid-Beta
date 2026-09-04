package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class tc extends zp0 {
    public final uc F;

    public tc(uc ucVar, Context context, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, f6Var);
        this.F = ucVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        uc ucVar = this.F;
        TextView textView = ucVar.d;
        if (textView != null) {
            textView.setTextColor(ucVar.f41059b.h.getTextColor());
        }
    }
}
