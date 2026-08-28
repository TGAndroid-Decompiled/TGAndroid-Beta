package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class xo implements Runnable {
    public final int f44554a;
    public final hp f44555b;
    public final org.telegram.ui.ActionBar.c2[] f44556c;
    public final int d;

    public xo(hp hpVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i9, int i10) {
        this.f44554a = i10;
        this.f44555b = hpVar;
        this.f44556c = c2VarArr;
        this.d = i9;
    }

    @Override
    public final void run() {
        switch (this.f44554a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f44556c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final hp hpVar = this.f44555b;
                    final int i9 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(hpVar.currentAccount).cancelRequest(i9, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(hpVar.currentAccount).cancelRequest(i9, true);
                                    return;
                            }
                        }
                    });
                    hpVar.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f44556c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final hp hpVar2 = this.f44555b;
                    final int i10 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(hpVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(hpVar2.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    hpVar2.showDialog(c2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
