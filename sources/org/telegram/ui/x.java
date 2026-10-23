package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f43461a;
    public final k4 f43462b;
    public final String f43463c;

    public x(k4 k4Var, String str, int i10) {
        this.f43461a = i10;
        this.f43462b = k4Var;
        this.f43463c = str;
    }

    @Override
    public final void run() {
        switch (this.f43461a) {
            case 0:
                k4 k4Var = this.f43462b;
                ai.t tVar = k4Var.f38793h0.f43271b0;
                String str = this.f43463c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = k4Var.f38793h0.f43271b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(k4Var.f38793h0.f43271b0);
                return;
            default:
                pf.d.l(this.f43462b.L, this.f43463c, false, null);
                return;
        }
    }
}
