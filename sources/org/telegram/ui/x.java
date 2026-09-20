package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f39274a;
    public final h4 f39275b;
    public final String f39276c;

    public x(h4 h4Var, String str, int i10) {
        this.f39274a = i10;
        this.f39275b = h4Var;
        this.f39276c = str;
    }

    @Override
    public final void run() {
        switch (this.f39274a) {
            case 0:
                h4 h4Var = this.f39275b;
                fi.o oVar = h4Var.f34102h0.f39077b0;
                String str = this.f39276c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = h4Var.f34102h0.f39077b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(h4Var.f34102h0.f39077b0);
                return;
            default:
                nf.f.m(this.f39275b.L, this.f39276c, false, null);
                return;
        }
    }
}
