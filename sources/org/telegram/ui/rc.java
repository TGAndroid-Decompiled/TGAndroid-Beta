package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class rc extends rn0 {
    public final sc G;

    public rc(sc scVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, j10, context, p6Var);
        this.G = scVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        sc scVar = this.G;
        TextView textView = scVar.d;
        if (textView != null) {
            textView.setTextColor(scVar.f41467b.h.getTextColor());
        }
    }
}
