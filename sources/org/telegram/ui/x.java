package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f45433a;
    public final j4 f45434b;
    public final String f45435c;

    public x(j4 j4Var, String str, int i10) {
        this.f45433a = i10;
        this.f45434b = j4Var;
        this.f45435c = str;
    }

    @Override
    public final void run() {
        switch (this.f45433a) {
            case 0:
                j4 j4Var = this.f45434b;
                bi.t tVar = j4Var.f40402h0.f44906b0;
                String str = this.f45435c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                bi.t tVar2 = j4Var.f40402h0.f44906b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(j4Var.f40402h0.f44906b0);
                return;
            default:
                qf.d.l(this.f45434b.L, this.f45435c, false, null);
                return;
        }
    }
}
