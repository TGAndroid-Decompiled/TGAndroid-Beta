package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ye0 implements Runnable {
    public final int f41813a;
    public final bf0 f41814b;

    public ye0(bf0 bf0Var, int i10) {
        this.f41813a = i10;
        this.f41814b = bf0Var;
    }

    @Override
    public final void run() {
        switch (this.f41813a) {
            case 0:
                bf0 bf0Var = this.f41814b;
                di.g2 g2Var = bf0Var.f34314c;
                g2Var.requestFocus();
                String str = bf0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = g2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = bf0Var.K.length() + i11;
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
                this.f41814b.q(true);
                return;
            case 2:
                this.f41814b.o(false);
                return;
            default:
                di.g2 g2Var2 = this.f41814b.f34314c;
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
