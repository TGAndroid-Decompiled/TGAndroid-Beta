package org.telegram.ui;

import android.content.DialogInterface;
public final class rg implements Runnable {
    public final int f37826a;
    public final zn f37827b;
    public final org.telegram.ui.ActionBar.d2[] f37828c;
    public final int d;

    public rg(zn znVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11) {
        this.f37826a = i11;
        this.f37827b = znVar;
        this.f37828c = d2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f37826a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f37828c;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    final zn znVar = this.f37827b;
                    final int i10 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    znVar.showDialog(d2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f37828c;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final zn znVar2 = this.f37827b;
                    final int i11 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    znVar2.showDialog(d2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr3 = this.f37828c;
                org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr3[0];
                if (d2Var3 != null) {
                    final zn znVar3 = this.f37827b;
                    final int i12 = this.d;
                    d2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    znVar3.showDialog(d2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
