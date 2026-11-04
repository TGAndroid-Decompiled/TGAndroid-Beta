package org.telegram.ui;

import android.content.DialogInterface;
public final class xf implements Runnable {
    public final int f52014a;
    public final wm f52015b;
    public final org.telegram.ui.ActionBar.s1[] f52016c;
    public final int d;

    public xf(wm wmVar, org.telegram.ui.ActionBar.s1[] s1VarArr, int i3, int i10) {
        this.f52014a = i10;
        this.f52015b = wmVar;
        this.f52016c = s1VarArr;
        this.d = i3;
    }

    @Override
    public final void run() {
        switch (this.f52014a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.f52016c;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var != null) {
                    final wm wmVar = this.f52015b;
                    final int i3 = this.d;
                    s1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    wmVar.getConnectionsManager().cancelRequest(i3, true);
                                    return;
                                case 1:
                                    wmVar.getConnectionsManager().cancelRequest(i3, true);
                                    return;
                                default:
                                    wmVar.getConnectionsManager().cancelRequest(i3, true);
                                    return;
                            }
                        }
                    });
                    wmVar.showDialog(s1VarArr[0]);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = this.f52016c;
                org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr2[0];
                if (s1Var2 != null) {
                    final wm wmVar2 = this.f52015b;
                    final int i10 = this.d;
                    s1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    wmVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                case 1:
                                    wmVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                                default:
                                    wmVar2.getConnectionsManager().cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    wmVar2.showDialog(s1VarArr2[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.s1[] s1VarArr3 = this.f52016c;
                org.telegram.ui.ActionBar.s1 s1Var3 = s1VarArr3[0];
                if (s1Var3 != null) {
                    final wm wmVar3 = this.f52015b;
                    final int i11 = this.d;
                    s1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    wmVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                case 1:
                                    wmVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                                default:
                                    wmVar3.getConnectionsManager().cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    wmVar3.showDialog(s1VarArr3[0]);
                    return;
                }
                return;
        }
    }
}
