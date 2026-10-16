package org.telegram.ui;

import android.content.Context;
public final class qy implements Runnable {
    public final int f39237a;
    public final ry f39238b;

    public qy(ry ryVar, int i10) {
        this.f39237a = i10;
        this.f39238b = ryVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39237a) {
            case 0:
                ry ryVar = this.f39238b;
                yy yyVar = ryVar.E0;
                Context context = ryVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                yyVar.showDialog(new sg.j0(3, i10, context, yyVar, null));
                return;
            default:
                yy yyVar2 = this.f39238b.E0;
                ux uxVar = yyVar2.M0;
                if (uxVar != null) {
                    uxVar.dismiss();
                    yyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
