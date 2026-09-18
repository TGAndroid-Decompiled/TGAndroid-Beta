package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f39336a;
    public final h4 f39337b;
    public final String f39338c;

    public x(h4 h4Var, String str, int i10) {
        this.f39336a = i10;
        this.f39337b = h4Var;
        this.f39338c = str;
    }

    @Override
    public final void run() {
        switch (this.f39336a) {
            case 0:
                h4 h4Var = this.f39337b;
                fi.o oVar = h4Var.f34161h0.f38957b0;
                String str = this.f39338c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = h4Var.f34161h0.f38957b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(h4Var.f34161h0.f38957b0);
                return;
            default:
                nf.f.m(this.f39337b.L, this.f39338c, false, null);
                return;
        }
    }
}
