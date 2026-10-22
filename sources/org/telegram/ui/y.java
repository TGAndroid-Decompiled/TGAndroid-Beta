package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f43317a;
    public final l4 f43318b;
    public final String f43319c;

    public y(l4 l4Var, String str, int i10) {
        this.f43317a = i10;
        this.f43318b = l4Var;
        this.f43319c = str;
    }

    @Override
    public final void run() {
        switch (this.f43317a) {
            case 0:
                l4 l4Var = this.f43318b;
                ai.t tVar = l4Var.f38770h0.f42791b0;
                String str = this.f43319c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = l4Var.f38770h0.f42791b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f38770h0.f42791b0);
                return;
            default:
                pf.d.l(this.f43318b.L, this.f43319c, false, null);
                return;
        }
    }
}
