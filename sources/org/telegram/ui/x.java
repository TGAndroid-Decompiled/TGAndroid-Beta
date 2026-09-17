package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f39331a;
    public final h4 f39332b;
    public final String f39333c;

    public x(h4 h4Var, String str, int i10) {
        this.f39331a = i10;
        this.f39332b = h4Var;
        this.f39333c = str;
    }

    @Override
    public final void run() {
        switch (this.f39331a) {
            case 0:
                h4 h4Var = this.f39332b;
                fi.o oVar = h4Var.f34156h0.f38952b0;
                String str = this.f39333c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = h4Var.f34156h0.f38952b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(h4Var.f34156h0.f38952b0);
                return;
            default:
                nf.f.m(this.f39332b.L, this.f39333c, false, null);
                return;
        }
    }
}
