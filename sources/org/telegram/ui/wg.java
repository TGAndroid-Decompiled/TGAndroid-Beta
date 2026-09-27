package org.telegram.ui;

import android.content.DialogInterface;
public final class wg implements Runnable {
    public final int f39334a;
    public final xn f39335b;
    public final org.telegram.ui.ActionBar.c2[] f39336c;
    public final int d;

    public wg(xn xnVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11) {
        this.f39334a = i11;
        this.f39335b = xnVar;
        this.f39336c = c2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39334a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f39336c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final xn xnVar = this.f39335b;
                    final int i10 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    xnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    xnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    xnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    xnVar.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f39336c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final xn xnVar2 = this.f39335b;
                    final int i11 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    xnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    xnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    xnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    xnVar2.showDialog(c2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr3 = this.f39336c;
                org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr3[0];
                if (c2Var3 != null) {
                    final xn xnVar3 = this.f39335b;
                    final int i12 = this.d;
                    c2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    xnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    xnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    xnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    xnVar3.showDialog(c2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
