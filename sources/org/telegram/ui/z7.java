package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z7 implements View.OnClickListener {
    public final int f44037a;
    public final Object f44038b;

    public z7(Object obj, int i10) {
        this.f44037a = i10;
        this.f44038b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44037a) {
            case 0:
                e8 e8Var = (e8) this.f44038b;
                h8 h8Var = e8Var.f36982y;
                if (e8Var.f36977n != null && h8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < e8Var.d; i12++) {
                        f8 f8Var = (f8) e8Var.f36977n.get(i12, null);
                        if (f8Var != null) {
                            if (i10 == -1) {
                                i10 = f8Var.h;
                            }
                            i11 = f8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        h8Var.P = i10;
                        h8Var.Q = i11;
                        h8Var.A0();
                        h8Var.t0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.wb.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f44038b).getSwipeBack().b(true);
                return;
            case 2:
                if (((q41) this.f44038b).f40866a.getImageReceiver().B() != null && !((q41) this.f44038b).f40866a.getImageReceiver().B().f24765k0) {
                    ((q41) this.f44038b).f40866a.getImageReceiver().B().N(0, false, false);
                    ((q41) this.f44038b).f40866a.getImageReceiver().B().H(false);
                    return;
                }
                return;
            case 3:
                gf.f.r((Context) this.f44038b, org.telegram.messenger.cd.L0(2131745273, null));
                return;
            default:
                ((pb1) this.f44038b).K0(true);
                return;
        }
    }
}
