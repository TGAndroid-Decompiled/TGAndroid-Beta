package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f45598a;
    public final j4 f45599b;
    public final String f45600c;

    public x(j4 j4Var, String str, int i10) {
        this.f45598a = i10;
        this.f45599b = j4Var;
        this.f45600c = str;
    }

    @Override
    public final void run() {
        switch (this.f45598a) {
            case 0:
                j4 j4Var = this.f45599b;
                bi.t tVar = j4Var.f40434h0.f45392b0;
                String str = this.f45600c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                bi.t tVar2 = j4Var.f40434h0.f45392b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(j4Var.f40434h0.f45392b0);
                return;
            default:
                qf.d.l(this.f45599b.L, this.f45600c, false, null);
                return;
        }
    }
}
