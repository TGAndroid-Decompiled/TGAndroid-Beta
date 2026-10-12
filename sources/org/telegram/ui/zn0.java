package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zn0 implements Runnable {
    public final int f42652a;
    public final cp0 f42653b;

    public zn0(cp0 cp0Var, int i10) {
        this.f42652a = i10;
        this.f42653b = cp0Var;
    }

    @Override
    public final void run() {
        switch (this.f42652a) {
            case 0:
                cp0 cp0Var = this.f42653b;
                cp0Var.f35008f[0].requestFocus();
                AndroidUtilities.showKeyboard(cp0Var.f35008f[0]);
                return;
            case 1:
                this.f42653b.t0();
                return;
            case 2:
                cp0 cp0Var2 = this.f42653b;
                cp0Var2.getMessagesController().newMessageCallback = null;
                if (cp0Var2.f35010f1 == 3 && !cp0Var2.isFinishing()) {
                    cp0Var2.f35010f1 = 4;
                    bp0 bp0Var = cp0Var2.Z0;
                    if (bp0Var != null) {
                        bp0Var.a(4);
                    }
                    cp0Var2.finishFragment();
                    return;
                } else if (cp0Var2.f35010f1 == 1 && !cp0Var2.isFinishing()) {
                    cp0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                cp0 cp0Var3 = this.f42653b;
                if (cp0Var3.f35004d0 != null) {
                    cp0Var3.w0();
                    cp0Var3.f35004d0 = null;
                    return;
                }
                return;
        }
    }
}
