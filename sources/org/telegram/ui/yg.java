package org.telegram.ui;

import android.content.DialogInterface;
public final class yg implements Runnable {
    public final int f44470a;
    public final eo f44471b;
    public final org.telegram.ui.ActionBar.a2[] f44472c;
    public final int d;

    public yg(eo eoVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.f44470a = i11;
        this.f44471b = eoVar;
        this.f44472c = a2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f44470a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f44472c;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final eo eoVar = this.f44471b;
                    final int i10 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    eoVar.showDialog(a2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f44472c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final eo eoVar2 = this.f44471b;
                    final int i11 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    eoVar2.showDialog(a2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr3 = this.f44472c;
                org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr3[0];
                if (a2Var3 != null) {
                    final eo eoVar3 = this.f44471b;
                    final int i12 = this.d;
                    a2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    eoVar3.showDialog(a2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
