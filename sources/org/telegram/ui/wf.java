package org.telegram.ui;

import android.content.DialogInterface;
public final class wf implements Runnable {
    public final int f52895a;
    public final an f52896b;
    public final org.telegram.ui.ActionBar.t1[] f52897c;
    public final int d;

    public wf(an anVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10) {
        this.f52895a = i10;
        this.f52896b = anVar;
        this.f52897c = t1VarArr;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f52895a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f52897c;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final an anVar = this.f52896b;
                    final int i7 = this.d;
                    t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    anVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                                case 1:
                                    anVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                                default:
                                    anVar.getConnectionsManager().cancelRequest(i7, true);
                                    return;
                            }
                        }
                    });
                    anVar.showDialog(t1VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f52897c;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final an anVar2 = this.f52896b;
                    final int i10 = this.d;
                    t1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    anVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    anVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    anVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    anVar2.showDialog(t1VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr3 = this.f52897c;
                org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr3[0];
                if (t1Var3 != null) {
                    final an anVar3 = this.f52896b;
                    final int i11 = this.d;
                    t1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    anVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    anVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    anVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    anVar3.showDialog(t1VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
