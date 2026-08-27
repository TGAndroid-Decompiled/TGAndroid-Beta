package org.telegram.ui;

import android.content.Context;
import android.view.View;

public final class u10 implements View.OnClickListener {

    public final int f43065a;

    public final Context f43066b;

    public final bg.a f43067c;

    public u10(Context context, bg.a aVar, int i10) {
        this.f43065a = i10;
        this.f43066b = context;
        this.f43067c = aVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43065a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f43066b;
                org.telegram.ui.Components.l8 l8Var = new org.telegram.ui.Components.l8(context, false, gVar, 1);
                bg.j jVar = this.f43067c.f2090c;
                l8Var.e(jVar != null ? jVar.C : 0, 0);
                l8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, false);
                e3Var.setCustomView(l8Var);
                e3Var.setDimBehind(false);
                e3Var.show();
                break;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f43066b;
                org.telegram.ui.Components.l8 l8Var2 = new org.telegram.ui.Components.l8(context2, false, gVar2, 2);
                bg.j jVar2 = this.f43067c.f2090c;
                l8Var2.e(jVar2 == null ? 0 : jVar2.B, 0);
                l8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(context2, false);
                e3Var2.setCustomView(l8Var2);
                e3Var2.setDimBehind(false);
                e3Var2.show();
                break;
        }
    }
}
