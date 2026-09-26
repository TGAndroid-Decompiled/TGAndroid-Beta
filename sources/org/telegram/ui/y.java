package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f40009a;
    public final i4 f40010b;
    public final String f40011c;

    public y(i4 i4Var, String str, int i10) {
        this.f40009a = i10;
        this.f40010b = i4Var;
        this.f40011c = str;
    }

    @Override
    public final void run() {
        switch (this.f40009a) {
            case 0:
                i4 i4Var = this.f40010b;
                fi.o oVar = i4Var.f34394h0.f39228b0;
                String str = this.f40011c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f34394h0.f39228b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f34394h0.f39228b0);
                return;
            default:
                nf.f.m(this.f40010b.L, this.f40011c, false, null);
                return;
        }
    }
}
