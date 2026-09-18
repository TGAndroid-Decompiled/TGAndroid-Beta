package org.telegram.ui;

import android.content.DialogInterface;
public final class wg implements Runnable {
    public final int f39143a;
    public final zn f39144b;
    public final org.telegram.ui.ActionBar.b2[] f39145c;
    public final int d;

    public wg(zn znVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f39143a = i11;
        this.f39144b = znVar;
        this.f39145c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39143a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f39145c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final zn znVar = this.f39144b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    znVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    znVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    znVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    znVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f39145c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final zn znVar2 = this.f39144b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    znVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    znVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    znVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    znVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.f39145c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final zn znVar3 = this.f39144b;
                    final int i12 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    znVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    znVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    znVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    znVar3.showDialog(b2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
