package org.telegram.ui;
public final class yf implements Runnable {
    public final int f52268a;
    public final org.telegram.ui.ActionBar.s1[] f52269b;

    public yf(org.telegram.ui.ActionBar.s1[] s1VarArr, int i3) {
        this.f52268a = i3;
        this.f52269b = s1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f52268a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.f52269b;
                try {
                    s1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                s1VarArr[0] = null;
                return;
            case 1:
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = this.f52269b;
                try {
                    s1VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                s1VarArr2[0] = null;
                return;
            case 2:
                org.telegram.messenger.g0.h3(new yf(this.f52269b, 4));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new yf(this.f52269b, 5));
                return;
            case 4:
                this.f52269b[0].dismiss();
                return;
            default:
                this.f52269b[0].dismiss();
                return;
        }
    }
}
