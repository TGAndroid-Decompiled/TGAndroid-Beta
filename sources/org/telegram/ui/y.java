package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f43283a;
    public final l4 f43284b;
    public final String f43285c;

    public y(l4 l4Var, String str, int i10) {
        this.f43283a = i10;
        this.f43284b = l4Var;
        this.f43285c = str;
    }

    @Override
    public final void run() {
        switch (this.f43283a) {
            case 0:
                l4 l4Var = this.f43284b;
                ai.t tVar = l4Var.f38713h0.f42749b0;
                String str = this.f43285c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = l4Var.f38713h0.f42749b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f38713h0.f42749b0);
                return;
            default:
                pf.d.l(this.f43284b.L, this.f43285c, false, null);
                return;
        }
    }
}
