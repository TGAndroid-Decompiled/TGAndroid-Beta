package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class v10 implements View.OnClickListener {
    public final int f44567a;
    public final Context f44568b;
    public final ug.g f44569c;

    public v10(Context context, ug.g gVar, int i10) {
        this.f44567a = i10;
        this.f44568b = context;
        this.f44569c = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f44567a) {
            case 0:
                f fVar = new f(this, 18);
                Context context = this.f44568b;
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false, fVar, 1);
                ug.o oVar = this.f44569c.f49778c;
                if (oVar != null) {
                    i10 = oVar.I;
                } else {
                    i10 = 0;
                }
                w8Var.e(i10, 0);
                w8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(context, false);
                k3Var.setCustomView(w8Var);
                k3Var.setDimBehind(false);
                k3Var.show();
                return;
            default:
                f fVar2 = new f(this, 19);
                Context context2 = this.f44568b;
                org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8(context2, false, fVar2, 2);
                ug.o oVar2 = this.f44569c.f49778c;
                if (oVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = oVar2.H;
                }
                w8Var2.e(i11, 0);
                w8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.k3 k3Var2 = new org.telegram.ui.ActionBar.k3(context2, false);
                k3Var2.setCustomView(w8Var2);
                k3Var2.setDimBehind(false);
                k3Var2.show();
                return;
        }
    }
}
