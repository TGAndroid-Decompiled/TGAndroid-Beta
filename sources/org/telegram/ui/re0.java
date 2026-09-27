package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class re0 implements Runnable {
    public final int f37109a;
    public final ue0 f37110b;

    public re0(ue0 ue0Var, int i10) {
        this.f37109a = i10;
        this.f37110b = ue0Var;
    }

    @Override
    public final void run() {
        switch (this.f37109a) {
            case 0:
                ue0 ue0Var = this.f37110b;
                ci.h2 h2Var = ue0Var.f38231c;
                h2Var.requestFocus();
                String str = ue0Var.K;
                if (str != null) {
                    int i10 = 1;
                    if (str.length() > 1) {
                        String obj = h2Var.getText().toString();
                        int length = obj.length();
                        int i11 = 0;
                        while (i11 < length && obj.charAt(i11) <= ' ') {
                            i11++;
                        }
                        int length2 = ue0Var.K.length() + i11;
                        h2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 0), obj.length(), 0), h2Var.getText().length());
                        return;
                    }
                }
                h2Var.setSelection(0, h2Var.getText().length());
                return;
            case 1:
                this.f37110b.q(true);
                return;
            case 2:
                this.f37110b.o(false);
                return;
            default:
                ci.h2 h2Var2 = this.f37110b.f38231c;
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
