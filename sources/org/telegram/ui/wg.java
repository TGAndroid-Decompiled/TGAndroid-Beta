package org.telegram.ui;

import android.content.DialogInterface;
public final class wg implements Runnable {
    public final int f42452a;
    public final yn f42453b;
    public final org.telegram.ui.ActionBar.b2[] f42454c;
    public final int d;

    public wg(yn ynVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f42452a = i11;
        this.f42453b = ynVar;
        this.f42454c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f42452a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f42454c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final yn ynVar = this.f42453b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ynVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    ynVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    ynVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    ynVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f42454c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final yn ynVar2 = this.f42453b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ynVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    ynVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    ynVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    ynVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.f42454c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final yn ynVar3 = this.f42453b;
                    final int i12 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ynVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    ynVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    ynVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    ynVar3.showDialog(b2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
