package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class t10 implements View.OnClickListener {
    public final int f42523a;
    public final Context f42524b;
    public final dg.a f42525c;

    public t10(Context context, dg.a aVar, int i10) {
        this.f42523a = i10;
        this.f42524b = context;
        this.f42525c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f42523a) {
            case 0:
                h hVar = new h(this, 18);
                Context context = this.f42524b;
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(context, false, hVar, 1);
                dg.j jVar = this.f42525c.f5551c;
                if (jVar != null) {
                    i10 = jVar.C;
                } else {
                    i10 = 0;
                }
                r8Var.e(i10, 0);
                r8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(r8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                return;
            default:
                h hVar2 = new h(this, 19);
                Context context2 = this.f42524b;
                org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8(context2, false, hVar2, 2);
                dg.j jVar2 = this.f42525c.f5551c;
                if (jVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = jVar2.B;
                }
                r8Var2.e(i11, 0);
                r8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(r8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                return;
        }
    }
}
