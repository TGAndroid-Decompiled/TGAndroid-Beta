package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f39420a;
    public final h4 f39421b;
    public final String f39422c;

    public x(h4 h4Var, String str, int i10) {
        this.f39420a = i10;
        this.f39421b = h4Var;
        this.f39422c = str;
    }

    @Override
    public final void run() {
        switch (this.f39420a) {
            case 0:
                h4 h4Var = this.f39421b;
                fi.o oVar = h4Var.f34139h0.f39109b0;
                String str = this.f39422c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = h4Var.f34139h0.f39109b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(h4Var.f34139h0.f39109b0);
                return;
            default:
                nf.f.m(this.f39421b.L, this.f39422c, false, null);
                return;
        }
    }
}
