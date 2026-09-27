package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rj0 implements Runnable {
    public final int f37144a;
    public final yj0 f37145b;

    public rj0(yj0 yj0Var, int i10) {
        this.f37144a = i10;
        this.f37145b = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37144a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f37145b.f40259b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f37145b.d.getEditText());
                return;
        }
    }
}
