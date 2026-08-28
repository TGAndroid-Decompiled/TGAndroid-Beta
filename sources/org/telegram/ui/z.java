package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class z implements Runnable {
    public final int f44987a;
    public final l4 f44988b;
    public final String f44989c;

    public z(l4 l4Var, String str, int i9) {
        this.f44987a = i9;
        this.f44988b = l4Var;
        this.f44989c = str;
    }

    @Override
    public final void run() {
        switch (this.f44987a) {
            case 0:
                l4 l4Var = this.f44988b;
                gh.o oVar = l4Var.f40014d0.U;
                String str = this.f44989c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                gh.o oVar2 = l4Var.f40014d0.U;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f40014d0.U);
                return;
            default:
                ve.e.m(this.f44988b.H, this.f44989c, false, null);
                return;
        }
    }
}
