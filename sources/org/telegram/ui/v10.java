package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class v10 implements View.OnClickListener {
    public final int f42533a;
    public final Context f42534b;
    public final tg.g f42535c;

    public v10(Context context, tg.g gVar, int i10) {
        this.f42533a = i10;
        this.f42534b = context;
        this.f42535c = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f42533a) {
            case 0:
                f fVar = new f(this, 18);
                Context context = this.f42534b;
                org.telegram.ui.Components.s8 s8Var = new org.telegram.ui.Components.s8(context, false, fVar, 1);
                tg.o oVar = this.f42535c.f47511c;
                if (oVar != null) {
                    i10 = oVar.I;
                } else {
                    i10 = 0;
                }
                s8Var.e(i10, 0);
                s8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, false);
                h3Var.setCustomView(s8Var);
                h3Var.setDimBehind(false);
                h3Var.show();
                return;
            default:
                f fVar2 = new f(this, 19);
                Context context2 = this.f42534b;
                org.telegram.ui.Components.s8 s8Var2 = new org.telegram.ui.Components.s8(context2, false, fVar2, 2);
                tg.o oVar2 = this.f42535c.f47511c;
                if (oVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = oVar2.H;
                }
                s8Var2.e(i11, 0);
                s8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context2, false);
                h3Var2.setCustomView(s8Var2);
                h3Var2.setDimBehind(false);
                h3Var2.show();
                return;
        }
    }
}
