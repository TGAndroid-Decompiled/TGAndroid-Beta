package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class v10 implements View.OnClickListener {
    public final int f42565a;
    public final Context f42566b;
    public final tg.g f42567c;

    public v10(Context context, tg.g gVar, int i10) {
        this.f42565a = i10;
        this.f42566b = context;
        this.f42567c = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f42565a) {
            case 0:
                f fVar = new f(this, 18);
                Context context = this.f42566b;
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false, fVar, 1);
                tg.o oVar = this.f42567c.f47512c;
                if (oVar != null) {
                    i10 = oVar.I;
                } else {
                    i10 = 0;
                }
                u8Var.e(i10, 0);
                u8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, false);
                h3Var.setCustomView(u8Var);
                h3Var.setDimBehind(false);
                h3Var.show();
                return;
            default:
                f fVar2 = new f(this, 19);
                Context context2 = this.f42566b;
                org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8(context2, false, fVar2, 2);
                tg.o oVar2 = this.f42567c.f47512c;
                if (oVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = oVar2.H;
                }
                u8Var2.e(i11, 0);
                u8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context2, false);
                h3Var2.setCustomView(u8Var2);
                h3Var2.setDimBehind(false);
                h3Var2.show();
                return;
        }
    }
}
