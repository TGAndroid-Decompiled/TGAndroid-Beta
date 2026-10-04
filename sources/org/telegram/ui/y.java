package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f42972a;
    public final i4 f42973b;
    public final String f42974c;

    public y(i4 i4Var, String str, int i10) {
        this.f42972a = i10;
        this.f42973b = i4Var;
        this.f42974c = str;
    }

    @Override
    public final void run() {
        switch (this.f42972a) {
            case 0:
                i4 i4Var = this.f42973b;
                fi.o oVar = i4Var.f37263h0.f42368b0;
                String str = this.f42974c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f37263h0.f42368b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f37263h0.f42368b0);
                return;
            default:
                nf.f.m(this.f42973b.L, this.f42974c, false, null);
                return;
        }
    }
}
