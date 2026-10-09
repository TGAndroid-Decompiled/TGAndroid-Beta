package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wg implements Runnable {
    public final int f43569a;
    public final org.telegram.ui.ActionBar.b2[] f43570b;

    public wg(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f43569a = i10;
        this.f43570b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f43569a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f43570b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f43570b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new wg(this.f43570b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new wg(this.f43570b, 5));
                return;
            case 4:
                this.f43570b[0].dismiss();
                return;
            default:
                this.f43570b[0].dismiss();
                return;
        }
    }
}
