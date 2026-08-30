package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class tc extends fp0 {
    public final uc C;

    public tc(uc ucVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j10, context, f6Var);
        this.C = ucVar;
    }

    @Override
    public final void b(int i10, boolean z4) {
        super.b(i10, z4);
        uc ucVar = this.C;
        TextView textView = ucVar.d;
        if (textView != null) {
            textView.setTextColor(ucVar.f38903b.h.getTextColor());
        }
    }
}
