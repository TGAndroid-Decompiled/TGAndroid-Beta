package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f43041a;
    public final i4 f43042b;
    public final String f43043c;

    public y(i4 i4Var, String str, int i10) {
        this.f43041a = i10;
        this.f43042b = i4Var;
        this.f43043c = str;
    }

    @Override
    public final void run() {
        switch (this.f43041a) {
            case 0:
                i4 i4Var = this.f43042b;
                fi.o oVar = i4Var.f37271h0.f42387b0;
                String str = this.f43043c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f37271h0.f42387b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f37271h0.f42387b0);
                return;
            default:
                nf.f.m(this.f43042b.L, this.f43043c, false, null);
                return;
        }
    }
}
