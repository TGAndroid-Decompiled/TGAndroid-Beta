package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f39284a;
    public final h4 f39285b;
    public final String f39286c;

    public x(h4 h4Var, String str, int i10) {
        this.f39284a = i10;
        this.f39285b = h4Var;
        this.f39286c = str;
    }

    @Override
    public final void run() {
        switch (this.f39284a) {
            case 0:
                h4 h4Var = this.f39285b;
                fi.o oVar = h4Var.f34062h0.f39077b0;
                String str = this.f39286c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = h4Var.f34062h0.f39077b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(h4Var.f34062h0.f39077b0);
                return;
            default:
                nf.f.m(this.f39285b.L, this.f39286c, false, null);
                return;
        }
    }
}
