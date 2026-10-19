package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class yo implements Runnable {
    public final int f43529a;
    public final ip f43530b;
    public final org.telegram.ui.ActionBar.b2[] f43531c;
    public final int d;

    public yo(ip ipVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f43529a = i11;
        this.f43530b = ipVar;
        this.f43531c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f43529a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f43531c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final ip ipVar = this.f43530b;
                    final int i10 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(ipVar.currentAccount).cancelRequest(i10, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(ipVar.currentAccount).cancelRequest(i10, true);
                                    return;
                            }
                        }
                    });
                    ipVar.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f43531c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final ip ipVar2 = this.f43530b;
                    final int i11 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(ipVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(ipVar2.currentAccount).cancelRequest(i11, true);
                                    return;
                            }
                        }
                    });
                    ipVar2.showDialog(b2VarArr2[0]);
                    return;
                }
                return;
        }
    }
}
