package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sg implements Runnable {
    public final int f38220a;
    public final org.telegram.ui.ActionBar.d2[] f38221b;

    public sg(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f38220a = i10;
        this.f38221b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f38220a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f38221b;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f38221b;
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                d2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new sg(this.f38221b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new sg(this.f38221b, 5));
                return;
            case 4:
                this.f38221b[0].dismiss();
                return;
            default:
                this.f38221b[0].dismiss();
                return;
        }
    }
}
