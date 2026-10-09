package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wg implements Runnable {
    public final int f43571a;
    public final org.telegram.ui.ActionBar.b2[] f43572b;

    public wg(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f43571a = i10;
        this.f43572b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f43571a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f43572b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f43572b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new wg(this.f43572b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new wg(this.f43572b, 5));
                return;
            case 4:
                this.f43572b[0].dismiss();
                return;
            default:
                this.f43572b[0].dismiss();
                return;
        }
    }
}
