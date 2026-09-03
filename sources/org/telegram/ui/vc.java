package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class vc extends lp0 {
    public final wc C;

    public vc(wc wcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j10, context, f6Var);
        this.C = wcVar;
    }

    @Override
    public final void b(int i10, boolean z4) {
        super.b(i10, z4);
        wc wcVar = this.C;
        TextView textView = wcVar.d;
        if (textView != null) {
            textView.setTextColor(wcVar.f39335b.h.getTextColor());
        }
    }
}
