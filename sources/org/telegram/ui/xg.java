package org.telegram.ui;

import android.content.DialogInterface;
public final class xg implements Runnable {
    public final int f38713a;
    public final eo f38714b;
    public final org.telegram.ui.ActionBar.d2[] f38715c;
    public final int d;

    public xg(eo eoVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11) {
        this.f38713a = i11;
        this.f38714b = eoVar;
        this.f38715c = d2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f38713a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f38715c;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    final eo eoVar = this.f38714b;
                    final int i10 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    eoVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    eoVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    eoVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    eoVar.showDialog(d2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f38715c;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final eo eoVar2 = this.f38714b;
                    final int i11 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    eoVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    eoVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    eoVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    eoVar2.showDialog(d2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr3 = this.f38715c;
                org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr3[0];
                if (d2Var3 != null) {
                    final eo eoVar3 = this.f38714b;
                    final int i12 = this.d;
                    d2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    eoVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    eoVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    eoVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    eoVar3.showDialog(d2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
