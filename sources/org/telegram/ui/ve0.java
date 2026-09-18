package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ve0 implements Runnable {
    public final int f38539a;
    public final ye0 f38540b;

    public ve0(ye0 ye0Var, int i10) {
        this.f38539a = i10;
        this.f38540b = ye0Var;
    }

    @Override
    public final void run() {
        switch (this.f38539a) {
            case 0:
                ye0 ye0Var = this.f38540b;
                ci.h2 h2Var = ye0Var.f39799c;
                h2Var.requestFocus();
                String str = ye0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = h2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = ye0Var.K.length() + i11;
                        h2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), h2Var.getText().length());
                        return;
                    }
                }
                h2Var.setSelection(0, h2Var.getText().length());
                return;
            case 1:
                this.f38540b.q(true);
                return;
            case 2:
                this.f38540b.o(false);
                return;
            default:
                ci.h2 h2Var2 = this.f38540b.f39799c;
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
