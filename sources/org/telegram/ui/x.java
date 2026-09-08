package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f42547a;
    public final i4 f42548b;
    public final String f42549c;

    public x(i4 i4Var, String str, int i10) {
        this.f42547a = i10;
        this.f42548b = i4Var;
        this.f42549c = str;
    }

    @Override
    public final void run() {
        switch (this.f42547a) {
            case 0:
                i4 i4Var = this.f42548b;
                gi.o oVar = i4Var.f37247h0.f42304b0;
                String str = this.f42549c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                gi.o oVar2 = i4Var.f37247h0.f42304b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f37247h0.f42304b0);
                return;
            default:
                of.f.m(this.f42548b.L, this.f42549c, false, null);
                return;
        }
    }
}
