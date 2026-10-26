package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class tc extends pp0 {
    public final uc G;

    public tc(uc ucVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, j10, context, u6Var);
        this.G = ucVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        uc ucVar = this.G;
        TextView textView = ucVar.d;
        if (textView != null) {
            textView.setTextColor(ucVar.f44091b.h.getTextColor());
        }
    }
}
