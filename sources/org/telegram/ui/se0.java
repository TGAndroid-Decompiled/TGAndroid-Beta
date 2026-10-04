package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class se0 implements Runnable {
    public final int f40466a;
    public final ve0 f40467b;

    public se0(ve0 ve0Var, int i10) {
        this.f40466a = i10;
        this.f40467b = ve0Var;
    }

    @Override
    public final void run() {
        switch (this.f40466a) {
            case 0:
                ve0 ve0Var = this.f40467b;
                ci.h2 h2Var = ve0Var.f41714c;
                h2Var.requestFocus();
                String str = ve0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = h2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = ve0Var.K.length() + i11;
                        h2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), h2Var.getText().length());
                        return;
                    }
                }
                h2Var.setSelection(0, h2Var.getText().length());
                return;
            case 1:
                this.f40467b.q(true);
                return;
            case 2:
                this.f40467b.o(false);
                return;
            default:
                ci.h2 h2Var2 = this.f40467b.f41714c;
                if (h2Var2 != null) {
                    h2Var2.requestFocus();
                    h2Var2.setSelection(h2Var2.length());
                    AndroidUtilities.showKeyboard(h2Var2);
                    return;
                }
                return;
        }
    }
}
