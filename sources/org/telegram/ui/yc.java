package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class yc extends cq0 {
    public final zc F;

    public yc(zc zcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, c6Var);
        this.F = zcVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        zc zcVar = this.F;
        TextView textView = zcVar.d;
        if (textView != null) {
            textView.setTextColor(zcVar.f42274b.h.getTextColor());
        }
    }
}
