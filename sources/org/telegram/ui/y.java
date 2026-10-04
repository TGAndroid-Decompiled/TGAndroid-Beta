package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f42971a;
    public final i4 f42972b;
    public final String f42973c;

    public y(i4 i4Var, String str, int i10) {
        this.f42971a = i10;
        this.f42972b = i4Var;
        this.f42973c = str;
    }

    @Override
    public final void run() {
        switch (this.f42971a) {
            case 0:
                i4 i4Var = this.f42972b;
                fi.o oVar = i4Var.f37262h0.f42367b0;
                String str = this.f42973c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f37262h0.f42367b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f37262h0.f42367b0);
                return;
            default:
                nf.f.m(this.f42972b.L, this.f42973c, false, null);
                return;
        }
    }
}
