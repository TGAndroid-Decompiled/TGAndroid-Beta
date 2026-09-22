package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f39298a;
    public final h4 f39299b;
    public final String f39300c;

    public x(h4 h4Var, String str, int i10) {
        this.f39298a = i10;
        this.f39299b = h4Var;
        this.f39300c = str;
    }

    @Override
    public final void run() {
        switch (this.f39298a) {
            case 0:
                h4 h4Var = this.f39299b;
                fi.o oVar = h4Var.f34118h0.f39098b0;
                String str = this.f39300c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = h4Var.f34118h0.f39098b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(h4Var.f34118h0.f39098b0);
                return;
            default:
                nf.f.m(this.f39299b.L, this.f39300c, false, null);
                return;
        }
    }
}
