package org.telegram.ui;

import android.content.DialogInterface;
public final class vg implements Runnable {
    public final int f43041a;
    public final zn f43042b;
    public final org.telegram.ui.ActionBar.a2[] f43043c;
    public final int d;

    public vg(zn znVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.f43041a = i11;
        this.f43042b = znVar;
        this.f43043c = a2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f43041a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f43043c;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final zn znVar = this.f43042b;
                    final int i10 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    znVar.showDialog(a2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f43043c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final zn znVar2 = this.f43042b;
                    final int i11 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    znVar2.showDialog(a2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr3 = this.f43043c;
                org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr3[0];
                if (a2Var3 != null) {
                    final zn znVar3 = this.f43042b;
                    final int i12 = this.d;
                    a2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    znVar3.showDialog(a2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
