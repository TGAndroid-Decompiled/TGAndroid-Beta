package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xg implements Runnable {
    public final int f39641a;
    public final org.telegram.ui.ActionBar.c2[] f39642b;

    public xg(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.f39641a = i10;
        this.f39642b = c2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f39641a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.f39642b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.f39642b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xg(this.f39642b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new xg(this.f39642b, 5));
                return;
            case 4:
                this.f39642b[0].dismiss();
                return;
            default:
                this.f39642b[0].dismiss();
                return;
        }
    }
}
