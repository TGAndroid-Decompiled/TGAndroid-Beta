package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class zc extends eq0 {
    public final ad F;

    public zc(ad adVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, c6Var);
        this.F = adVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        ad adVar = this.F;
        TextView textView = adVar.d;
        if (textView != null) {
            textView.setTextColor(adVar.f34182b.h.getTextColor());
        }
    }
}
