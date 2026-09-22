package org.telegram.ui;

import android.content.DialogInterface;
public final class wg implements Runnable {
    public final int f39193a;
    public final bo f39194b;
    public final org.telegram.ui.ActionBar.b2[] f39195c;
    public final int d;

    public wg(bo boVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f39193a = i11;
        this.f39194b = boVar;
        this.f39195c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39193a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f39195c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final bo boVar = this.f39194b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    boVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    boVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    boVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    boVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f39195c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final bo boVar2 = this.f39194b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    boVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    boVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    boVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    boVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.f39195c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final bo boVar3 = this.f39194b;
                    final int i12 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    boVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    boVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    boVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    boVar3.showDialog(b2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
