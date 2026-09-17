package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f42548a;
    public final i4 f42549b;
    public final String f42550c;

    public x(i4 i4Var, String str, int i10) {
        this.f42548a = i10;
        this.f42549b = i4Var;
        this.f42550c = str;
    }

    @Override
    public final void run() {
        switch (this.f42548a) {
            case 0:
                i4 i4Var = this.f42549b;
                gi.o oVar = i4Var.f37248h0.f42305b0;
                String str = this.f42550c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                gi.o oVar2 = i4Var.f37248h0.f42305b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f37248h0.f42305b0);
                return;
            default:
                of.f.m(this.f42549b.L, this.f42550c, false, null);
                return;
        }
    }
}
