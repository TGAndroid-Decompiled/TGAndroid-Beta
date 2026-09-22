package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f39414a;
    public final h4 f39415b;
    public final String f39416c;

    public x(h4 h4Var, String str, int i10) {
        this.f39414a = i10;
        this.f39415b = h4Var;
        this.f39416c = str;
    }

    @Override
    public final void run() {
        switch (this.f39414a) {
            case 0:
                h4 h4Var = this.f39415b;
                fi.o oVar = h4Var.f34078h0.f39113b0;
                String str = this.f39416c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = h4Var.f34078h0.f39113b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(h4Var.f34078h0.f39113b0);
                return;
            default:
                nf.f.m(this.f39415b.L, this.f39416c, false, null);
                return;
        }
    }
}
