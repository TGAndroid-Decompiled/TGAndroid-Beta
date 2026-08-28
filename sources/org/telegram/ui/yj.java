package org.telegram.ui;

import android.content.Context;
public final class yj extends org.telegram.ui.Components.jo {
    public final qn f44885f;

    public yj(qn qnVar, Context context) {
        super(context);
        this.f44885f = qnVar;
    }

    @Override
    public final void a(boolean z10) {
        qn qnVar = this.f44885f;
        qnVar.t7();
        qnVar.r7();
        qnVar.u7();
        qnVar.v7();
        rk rkVar = qnVar.Xa;
        if (rkVar != null) {
            rkVar.setTranslationY(qnVar.f42073s9 + getCurrentHeight());
        }
        if (z10) {
            qnVar.f42162z9 = true;
            qnVar.jc();
            return;
        }
        qnVar.o9();
    }
}
