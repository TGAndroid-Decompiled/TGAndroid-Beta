package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class we0 implements Runnable {
    public final int f38699a;
    public final ze0 f38700b;

    public we0(ze0 ze0Var, int i10) {
        this.f38699a = i10;
        this.f38700b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f38699a) {
            case 0:
                ze0 ze0Var = this.f38700b;
                ci.h2 h2Var = ze0Var.f40235c;
                h2Var.requestFocus();
                String str = ze0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = h2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = ze0Var.K.length() + i11;
                        h2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), h2Var.getText().length());
                        return;
                    }
                }
                h2Var.setSelection(0, h2Var.getText().length());
                return;
            case 1:
                this.f38700b.q(true);
                return;
            case 2:
                this.f38700b.o(false);
                return;
            default:
                ci.h2 h2Var2 = this.f38700b.f40235c;
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
