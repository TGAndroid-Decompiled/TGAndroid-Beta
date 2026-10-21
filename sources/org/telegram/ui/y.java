package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f43314a;
    public final l4 f43315b;
    public final String f43316c;

    public y(l4 l4Var, String str, int i10) {
        this.f43314a = i10;
        this.f43315b = l4Var;
        this.f43316c = str;
    }

    @Override
    public final void run() {
        switch (this.f43314a) {
            case 0:
                l4 l4Var = this.f43315b;
                ai.t tVar = l4Var.f38767h0.f42788b0;
                String str = this.f43316c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = l4Var.f38767h0.f42788b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f38767h0.f42788b0);
                return;
            default:
                pf.d.l(this.f43315b.L, this.f43316c, false, null);
                return;
        }
    }
}
