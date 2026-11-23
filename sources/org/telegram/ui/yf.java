package org.telegram.ui;

import android.content.DialogInterface;
public final class yf implements Runnable {
    public final int f54357a;
    public final bn f54358b;
    public final org.telegram.ui.ActionBar.t1[] f54359c;
    public final int d;

    public yf(bn bnVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10) {
        this.f54357a = i10;
        this.f54358b = bnVar;
        this.f54359c = t1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f54357a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f54359c;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final bn bnVar = this.f54358b;
                    final int i7 = this.d;
                    t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    bnVar.showDialog(t1VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f54359c;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final bn bnVar2 = this.f54358b;
                    final int i10 = this.d;
                    t1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    bnVar2.showDialog(t1VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr3 = this.f54359c;
                org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr3[0];
                if (t1Var3 != null) {
                    final bn bnVar3 = this.f54358b;
                    final int i11 = this.d;
                    t1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    bnVar3.showDialog(t1VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
