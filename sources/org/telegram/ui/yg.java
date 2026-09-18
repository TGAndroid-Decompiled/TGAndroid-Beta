package org.telegram.ui;

import android.content.DialogInterface;
public final class yg implements Runnable {
    public final int f39884a;
    public final bo f39885b;
    public final org.telegram.ui.ActionBar.c2[] f39886c;
    public final int d;

    public yg(bo boVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, int i11) {
        this.f39884a = i11;
        this.f39885b = boVar;
        this.f39886c = c2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39884a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f39886c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final bo boVar = this.f39885b;
                    final int i10 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    boVar.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f39886c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final bo boVar2 = this.f39885b;
                    final int i11 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    boVar2.showDialog(c2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr3 = this.f39886c;
                org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr3[0];
                if (c2Var3 != null) {
                    final bo boVar3 = this.f39885b;
                    final int i12 = this.d;
                    c2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    boVar3.showDialog(c2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
