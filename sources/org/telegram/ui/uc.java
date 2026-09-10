package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
public final class uc extends yp0 {
    public final vc F;

    public uc(vc vcVar, Context context, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, f6Var);
        this.F = vcVar;
    }

    @Override
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        vc vcVar = this.F;
        TextView textView = vcVar.d;
        if (textView != null) {
            textView.setTextColor(vcVar.f37532b.h.getTextColor());
        }
    }
}
