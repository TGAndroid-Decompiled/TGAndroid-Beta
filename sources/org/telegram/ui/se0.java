package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class se0 implements Runnable {
    public final int f41720a;
    public final ve0 f41721b;

    public se0(ve0 ve0Var, int i10) {
        this.f41720a = i10;
        this.f41721b = ve0Var;
    }

    @Override
    public final void run() {
        switch (this.f41720a) {
            case 0:
                ve0 ve0Var = this.f41721b;
                ci.g2 g2Var = ve0Var.f42991c;
                g2Var.requestFocus();
                String str = ve0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = g2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = ve0Var.K.length() + i11;
                        if (length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') {
                            i10 = 0;
                        }
                        g2Var.setSelection(Utilities.clamp(length2 + i10, obj.length(), 0), g2Var.getText().length());
                        return;
                    }
                }
                g2Var.setSelection(0, g2Var.getText().length());
                return;
            case 1:
                this.f41721b.q(true);
                return;
            case 2:
                this.f41721b.o(false);
                return;
            default:
                ci.g2 g2Var2 = this.f41721b.f42991c;
                if (g2Var2 != null) {
                    g2Var2.requestFocus();
                    g2Var2.setSelection(g2Var2.length());
                    AndroidUtilities.showKeyboard(g2Var2);
                    return;
                }
                return;
        }
    }
}
