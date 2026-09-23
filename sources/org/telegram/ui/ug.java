package org.telegram.ui;

import android.content.DialogInterface;
public final class ug implements Runnable {
    public final int f38102a;
    public final xn f38103b;
    public final org.telegram.ui.ActionBar.b2[] f38104c;
    public final int d;

    public ug(xn xnVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f38102a = i11;
        this.f38103b = xnVar;
        this.f38104c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f38102a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f38104c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final xn xnVar = this.f38103b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    xnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    xnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    xnVar.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    xnVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f38104c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final xn xnVar2 = this.f38103b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    xnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    xnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    xnVar2.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    xnVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.f38104c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final xn xnVar3 = this.f38103b;
                    final int i12 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    xnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                case 1:
                                    xnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                                default:
                                    xnVar3.getConnectionsManager().cancelRequest(i12, true);
                                    return;
                            }
                        }
                    });
                    xnVar3.showDialog(b2VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
