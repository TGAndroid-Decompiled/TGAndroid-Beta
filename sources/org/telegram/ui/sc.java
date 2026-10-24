package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class sc extends ip0 {
    public final tc G;

    public sc(tc tcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, j10, context, g6Var);
        this.G = tcVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        tc tcVar = this.G;
        TextView textView = tcVar.d;
        if (textView != null) {
            textView.setTextColor(tcVar.f41990b.h.getTextColor());
        }
    }
}
