package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class sc extends yp0 {
    public final tc F;

    public sc(tc tcVar, Context context, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, j3, context, e6Var);
        this.F = tcVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        tc tcVar = this.F;
        TextView textView = tcVar.d;
        if (textView != null) {
            textView.setTextColor(tcVar.f37641b.h.getTextColor());
        }
    }
}
