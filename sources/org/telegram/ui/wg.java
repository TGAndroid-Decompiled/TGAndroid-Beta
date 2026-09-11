package org.telegram.ui;

import android.content.DialogInterface;
public final class wg implements Runnable {
    public final int f42355a;
    public final co f42356b;
    public final org.telegram.ui.ActionBar.b2[] f42357c;
    public final int d;

    public wg(co coVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f42355a = i11;
        this.f42356b = coVar;
        this.f42357c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f42355a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f42357c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final co coVar = this.f42356b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    coVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    coVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    coVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    coVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f42357c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final co coVar2 = this.f42356b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    coVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    coVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    coVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    coVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.f42357c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final co coVar3 = this.f42356b;
                    final int i12 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    coVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    coVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    coVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    coVar3.showDialog(b2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
