package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class sc extends lp0 {
    public final tc C;

    public sc(tc tcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, j10, context, g6Var);
        this.C = tcVar;
    }

    @Override
    public final void b(int i10, boolean z4) {
        super.b(i10, z4);
        tc tcVar = this.C;
        TextView textView = tcVar.d;
        if (textView != null) {
            textView.setTextColor(tcVar.f41503b.h.getTextColor());
        }
    }
}
