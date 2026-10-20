package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class r10 implements View.OnClickListener {
    public final int f41030a;
    public final Context f41031b;
    public final tg.g f41032c;

    public r10(Context context, tg.g gVar, int i10) {
        this.f41030a = i10;
        this.f41031b = context;
        this.f41032c = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f41030a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f41031b;
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false, gVar, 1);
                tg.o oVar = this.f41032c.f47073c;
                if (oVar != null) {
                    i10 = oVar.I;
                } else {
                    i10 = 0;
                }
                u8Var.e(i10, 0);
                u8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(u8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f41031b;
                org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8(context2, false, gVar2, 2);
                tg.o oVar2 = this.f41032c.f47073c;
                if (oVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = oVar2.H;
                }
                u8Var2.e(i11, 0);
                u8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(u8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                return;
        }
    }
}
