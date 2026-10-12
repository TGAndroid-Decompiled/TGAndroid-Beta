package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ue0 implements Runnable {
    public final int f42503a;
    public final xe0 f42504b;

    public ue0(xe0 xe0Var, int i10) {
        this.f42503a = i10;
        this.f42504b = xe0Var;
    }

    @Override
    public final void run() {
        switch (this.f42503a) {
            case 0:
                xe0 xe0Var = this.f42504b;
                ci.g2 g2Var = xe0Var.f43915c;
                g2Var.requestFocus();
                String str = xe0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = g2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = xe0Var.K.length() + i11;
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
                this.f42504b.q(true);
                return;
            case 2:
                this.f42504b.o(false);
                return;
            default:
                ci.g2 g2Var2 = this.f42504b.f43915c;
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
