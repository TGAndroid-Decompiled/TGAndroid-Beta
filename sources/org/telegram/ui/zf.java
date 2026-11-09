package org.telegram.ui;

import android.content.DialogInterface;
public final class zf implements Runnable {
    public final int f52545a;
    public final cn f52546b;
    public final org.telegram.ui.ActionBar.u1[] f52547c;
    public final int d;

    public zf(cn cnVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10) {
        this.f52545a = i10;
        this.f52546b = cnVar;
        this.f52547c = u1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f52545a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f52547c;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    final cn cnVar = this.f52546b;
                    final int i7 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    cnVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                                case 1:
                                    cnVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                                default:
                                    cnVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                            }
                        }
                    });
                    cnVar.showDialog(u1VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.f52547c;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final cn cnVar2 = this.f52546b;
                    final int i10 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    cnVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    cnVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    cnVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    cnVar2.showDialog(u1VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr3 = this.f52547c;
                org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr3[0];
                if (u1Var3 != null) {
                    final cn cnVar3 = this.f52546b;
                    final int i11 = this.d;
                    u1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    cnVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    cnVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    cnVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    cnVar3.showDialog(u1VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
