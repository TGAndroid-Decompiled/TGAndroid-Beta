package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f45601a;
    public final j4 f45602b;
    public final String f45603c;

    public x(j4 j4Var, String str, int i10) {
        this.f45601a = i10;
        this.f45602b = j4Var;
        this.f45603c = str;
    }

    @Override
    public final void run() {
        switch (this.f45601a) {
            case 0:
                j4 j4Var = this.f45602b;
                bi.t tVar = j4Var.f40437h0.f45395b0;
                String str = this.f45603c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                bi.t tVar2 = j4Var.f40437h0.f45395b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(j4Var.f40437h0.f45395b0);
                return;
            default:
                qf.d.l(this.f45602b.L, this.f45603c, false, null);
                return;
        }
    }
}
