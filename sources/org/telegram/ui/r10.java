package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class r10 implements View.OnClickListener {
    public final int f42249a;
    public final Context f42250b;
    public final ag.a f42251c;

    public r10(Context context, ag.a aVar, int i9) {
        this.f42249a = i9;
        this.f42250b = context;
        this.f42251c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        switch (this.f42249a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f42250b;
                org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(context, false, gVar, 1);
                ag.k kVar = this.f42251c.f164c;
                if (kVar != null) {
                    i9 = kVar.C;
                } else {
                    i9 = 0;
                }
                m8Var.e(i9, 0);
                m8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(m8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f42250b;
                org.telegram.ui.Components.m8 m8Var2 = new org.telegram.ui.Components.m8(context2, false, gVar2, 2);
                ag.k kVar2 = this.f42251c.f164c;
                if (kVar2 == null) {
                    i10 = 0;
                } else {
                    i10 = kVar2.B;
                }
                m8Var2.e(i10, 0);
                m8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(m8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                return;
        }
    }
}
