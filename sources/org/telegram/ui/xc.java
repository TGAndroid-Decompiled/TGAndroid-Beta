package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class xc extends aq0 {
    public final yc F;

    public xc(yc ycVar, Context context, int i10, long j3, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j3, context, c6Var);
        this.F = ycVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        yc ycVar = this.F;
        TextView textView = ycVar.d;
        if (textView != null) {
            textView.setTextColor(ycVar.f44450b.h.getTextColor());
        }
    }
}
