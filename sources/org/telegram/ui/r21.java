package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class r21 implements Runnable {
    public final int f42985a;
    public final u21 f42986b;

    public r21(u21 u21Var, int i10) {
        this.f42985a = i10;
        this.f42986b = u21Var;
    }

    @Override
    public final void run() {
        switch (this.f42985a) {
            case 0:
                u21 u21Var = this.f42986b;
                v21 v21Var = u21Var.v;
                if (u21Var.f43984a == 0) {
                    v21Var.dismiss();
                    return;
                } else {
                    v21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f42986b.f43988n.d);
                return;
        }
    }
}
