package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ue0 implements Runnable {
    public final int f37247a;
    public final xe0 f37248b;

    public ue0(xe0 xe0Var, int i10) {
        this.f37247a = i10;
        this.f37248b = xe0Var;
    }

    @Override
    public final void run() {
        switch (this.f37247a) {
            case 0:
                xe0 xe0Var = this.f37248b;
                bi.t2 t2Var = xe0Var.f38686c;
                t2Var.requestFocus();
                String str = xe0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = t2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = xe0Var.K.length() + i11;
                        t2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), t2Var.getText().length());
                        return;
                    }
                }
                t2Var.setSelection(0, t2Var.getText().length());
                return;
            case 1:
                this.f37248b.q(true);
                return;
            case 2:
                this.f37248b.o(false);
                return;
            default:
                bi.t2 t2Var2 = this.f37248b.f38686c;
                if (t2Var2 != null) {
                    t2Var2.requestFocus();
                    t2Var2.setSelection(t2Var2.length());
                    AndroidUtilities.showKeyboard(t2Var2);
                    return;
                }
                return;
        }
    }
}
