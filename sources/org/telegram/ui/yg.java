package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yg implements Runnable {
    public final int f38995a;
    public final org.telegram.ui.ActionBar.d2[] f38996b;

    public yg(org.telegram.ui.ActionBar.d2[] d2VarArr, int i10) {
        this.f38995a = i10;
        this.f38996b = d2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f38995a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.f38996b;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.f38996b;
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                d2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new yg(this.f38996b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new yg(this.f38996b, 5));
                return;
            case 4:
                this.f38996b[0].dismiss();
                return;
            default:
                this.f38996b[0].dismiss();
                return;
        }
    }
}
