package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class uc extends ip0 {
    public final vc F;

    public uc(vc vcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j10, context, d6Var);
        this.F = vcVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        vc vcVar = this.F;
        TextView textView = vcVar.d;
        if (textView != null) {
            textView.setTextColor(vcVar.f42145b.h.getTextColor());
        }
    }
}
