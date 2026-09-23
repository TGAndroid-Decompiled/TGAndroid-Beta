package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vg implements Runnable {
    public final int f38389a;
    public final org.telegram.ui.ActionBar.b2[] f38390b;

    public vg(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.f38389a = i10;
        this.f38390b = b2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f38389a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.f38390b;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.f38390b;
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                b2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new vg(this.f38390b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new vg(this.f38390b, 5));
                return;
            case 4:
                this.f38390b[0].dismiss();
                return;
            default:
                this.f38390b[0].dismiss();
                return;
        }
    }
}
