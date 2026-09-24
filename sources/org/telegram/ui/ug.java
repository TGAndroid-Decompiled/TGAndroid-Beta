package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ug implements Runnable {
    public final int f38452a;
    public final org.telegram.ui.ActionBar.a2[] f38453b;

    public ug(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.f38452a = i10;
        this.f38453b = a2VarArr;
    }

    @Override
    public final void run() {
        switch (this.f38452a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.f38453b;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.f38453b;
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                a2VarArr2[0] = null;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ug(this.f38453b, 4));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ug(this.f38453b, 5));
                return;
            case 4:
                this.f38453b[0].dismiss();
                return;
            default:
                this.f38453b[0].dismiss();
                return;
        }
    }
}
