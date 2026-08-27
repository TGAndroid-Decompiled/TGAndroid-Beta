package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

public final class zo implements Runnable {

    public final int f45218a;

    public final jp f45219b;

    public final org.telegram.ui.ActionBar.b2[] f45220c;
    public final int d;

    public zo(jp jpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.f45218a = i11;
        this.f45219b = jpVar;
        this.f45220c = b2VarArr;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f45218a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f45220c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final int i10 = 1;
                    final jp jpVar = this.f45219b;
                    final int i11 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ConnectionsManager.getInstance(jpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(jpVar.currentAccount).cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    jpVar.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f45220c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final int i12 = 0;
                    final jp jpVar2 = this.f45219b;
                    final int i13 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ConnectionsManager.getInstance(jpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(jpVar2.currentAccount).cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    jpVar2.showDialog(b2VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
