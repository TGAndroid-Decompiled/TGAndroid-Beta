package org.telegram.ui;

import android.content.DialogInterface;
public final class yf implements Runnable {
    public final int f54136a;
    public final bn f54137b;
    public final org.telegram.ui.ActionBar.u1[] f54138c;
    public final int d;

    public yf(bn bnVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10) {
        this.f54136a = i10;
        this.f54137b = bnVar;
        this.f54138c = u1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f54136a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f54138c;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    final bn bnVar = this.f54137b;
                    final int i7 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    bnVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                                case 1:
                                    bnVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                                default:
                                    bnVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                            }
                        }
                    });
                    bnVar.showDialog(u1VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f54138c;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final bn bnVar2 = this.f54137b;
                    final int i10 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    bnVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    bnVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    bnVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    bnVar2.showDialog(u1VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr3 = this.f54138c;
                org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr3[0];
                if (u1Var3 != null) {
                    final bn bnVar3 = this.f54137b;
                    final int i11 = this.d;
                    u1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    bnVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    bnVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    bnVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    bnVar3.showDialog(u1VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
