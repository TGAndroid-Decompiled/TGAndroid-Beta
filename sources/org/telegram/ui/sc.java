package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class sc extends gp0 {
    public final tc F;

    public sc(tc tcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j10, context, d6Var);
        this.F = tcVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        tc tcVar = this.F;
        TextView textView = tcVar.d;
        if (textView != null) {
            textView.setTextColor(tcVar.f41631b.h.getTextColor());
        }
    }
}
