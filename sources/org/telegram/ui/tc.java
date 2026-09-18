package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class tc extends aq0 {
    public final uc F;

    public tc(uc ucVar, Context context, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, j3, context, e6Var);
        this.F = ucVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        uc ucVar = this.F;
        TextView textView = ucVar.d;
        if (textView != null) {
            textView.setTextColor(ucVar.f37961b.h.getTextColor());
        }
    }
}
