package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ue0 implements Runnable {
    public final int f37987a;
    public final xe0 f37988b;

    public ue0(xe0 xe0Var, int i10) {
        this.f37987a = i10;
        this.f37988b = xe0Var;
    }

    @Override
    public final void run() {
        switch (this.f37987a) {
            case 0:
                xe0 xe0Var = this.f37988b;
                ci.h2 h2Var = xe0Var.f39598c;
                h2Var.requestFocus();
                String str = xe0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = h2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = xe0Var.K.length() + i11;
                        h2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), h2Var.getText().length());
                        return;
                    }
                }
                h2Var.setSelection(0, h2Var.getText().length());
                return;
            case 1:
                this.f37988b.q(true);
                return;
            case 2:
                this.f37988b.o(false);
                return;
            default:
                ci.h2 h2Var2 = this.f37988b.f39598c;
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
