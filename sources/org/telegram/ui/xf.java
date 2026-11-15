package org.telegram.ui;
public final class xf implements Runnable {
    public final int f53220a;
    public final org.telegram.ui.ActionBar.t1[] f53221b;

    public xf(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.f53220a = i7;
        this.f53221b = t1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f53220a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f53221b;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f53221b;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr2[0] = null;
                return;
            case 2:
                org.telegram.messenger.g0.h3(new xf(this.f53221b, 4));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new xf(this.f53221b, 5));
                return;
            case 4:
                this.f53221b[0].dismiss();
                return;
            default:
                this.f53221b[0].dismiss();
                return;
        }
    }
}
