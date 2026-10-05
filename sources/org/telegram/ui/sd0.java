package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sd0 implements Runnable {
    public final int f40448a;
    public final ff0 f40449b;

    public sd0(ff0 ff0Var, int i10) {
        this.f40448a = i10;
        this.f40449b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f40448a) {
            case 0:
                this.f40449b.L.n();
                return;
            case 1:
                ff0 ff0Var = this.f40449b;
                ff0Var.M = null;
                ff0Var.N = null;
                ff0Var.p(true);
                ff0Var.f36294e.h(null, null, ff0Var.f36295f, null);
                kd kdVar = ff0Var.f36296n;
                org.telegram.ui.Components.kj0 kj0Var = ff0Var.I;
                kdVar.setAnimation(kj0Var);
                kj0Var.M(0);
                ff0Var.K = true;
                return;
            case 2:
                this.f40449b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f40449b.f36293c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
