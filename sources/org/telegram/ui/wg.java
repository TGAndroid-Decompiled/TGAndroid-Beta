package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wg implements Runnable {
    public final int f43803a;
    public final org.telegram.ui.ActionBar.a2[] f43804b;

    public wg(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f43803a = i10;
        this.f43804b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f43803a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f43804b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f43804b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new wg(this.f43804b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new wg(this.f43804b, 5));
                return;
            case 4:
                this.f43804b[0].dismiss();
                return;
            default:
                this.f43804b[0].dismiss();
                return;
        }
    }
}
