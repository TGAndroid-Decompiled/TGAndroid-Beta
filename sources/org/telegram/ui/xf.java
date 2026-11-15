package org.telegram.ui;
public final class xf implements Runnable {
    public final int f53219a;
    public final org.telegram.ui.ActionBar.t1[] f53220b;

    public xf(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.f53219a = i7;
        this.f53220b = t1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f53219a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f53220b;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.f53220b;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr2[0] = null;
                return;
            case 2:
                org.telegram.messenger.g0.h3(new xf(this.f53220b, 4));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new xf(this.f53220b, 5));
                return;
            case 4:
                this.f53220b[0].dismiss();
                return;
            default:
                this.f53220b[0].dismiss();
                return;
        }
    }
}
