package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sd0 implements Runnable {
    public final int f40465a;
    public final ff0 f40466b;

    public sd0(ff0 ff0Var, int i10) {
        this.f40465a = i10;
        this.f40466b = ff0Var;
    }

    @Override
    public final void run() {
        switch (this.f40465a) {
            case 0:
                this.f40466b.L.n();
                return;
            case 1:
                ff0 ff0Var = this.f40466b;
                ff0Var.M = null;
                ff0Var.N = null;
                ff0Var.p(true);
                ff0Var.f36293e.h(null, null, ff0Var.f36294f, null);
                kd kdVar = ff0Var.f36295n;
                org.telegram.ui.Components.kj0 kj0Var = ff0Var.I;
                kdVar.setAnimation(kj0Var);
                kj0Var.M(0);
                ff0Var.K = true;
                return;
            case 2:
                this.f40466b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f40466b.f36292c;
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
