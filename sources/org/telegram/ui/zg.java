package org.telegram.ui;

import android.content.DialogInterface;
public final class zg implements Runnable {
    public final int f42306a;
    public final fo f42307b;
    public final org.telegram.ui.ActionBar.a2[] f42308c;
    public final int d;

    public zg(fo foVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.f42306a = i11;
        this.f42307b = foVar;
        this.f42308c = a2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f42306a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f42308c;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final fo foVar = this.f42307b;
                    final int i10 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    foVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    foVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    foVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    foVar.showDialog(a2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f42308c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final fo foVar2 = this.f42307b;
                    final int i11 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    foVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    foVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    foVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    foVar2.showDialog(a2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr3 = this.f42308c;
                org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr3[0];
                if (a2Var3 != null) {
                    final fo foVar3 = this.f42307b;
                    final int i12 = this.d;
                    a2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    foVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    foVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    foVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    foVar3.showDialog(a2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
