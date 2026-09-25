package org.telegram.ui;

import android.content.DialogInterface;
public final class tg implements Runnable {
    public final int f38111a;
    public final wn f38112b;
    public final org.telegram.ui.ActionBar.a2[] f38113c;
    public final int d;

    public tg(wn wnVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.f38111a = i11;
        this.f38112b = wnVar;
        this.f38113c = a2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f38111a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f38113c;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final wn wnVar = this.f38112b;
                    final int i10 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    wnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    wnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    wnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    wnVar.showDialog(a2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f38113c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final wn wnVar2 = this.f38112b;
                    final int i11 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    wnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    wnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    wnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    wnVar2.showDialog(a2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr3 = this.f38113c;
                org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr3[0];
                if (a2Var3 != null) {
                    final wn wnVar3 = this.f38112b;
                    final int i12 = this.d;
                    a2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    wnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    wnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    wnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    wnVar3.showDialog(a2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
