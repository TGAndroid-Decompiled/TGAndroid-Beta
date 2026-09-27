package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class z implements Runnable {
    public final int f40359a;
    public final j4 f40360b;
    public final String f40361c;

    public z(j4 j4Var, String str, int i10) {
        this.f40359a = i10;
        this.f40360b = j4Var;
        this.f40361c = str;
    }

    @Override
    public final void run() {
        switch (this.f40359a) {
            case 0:
                j4 j4Var = this.f40360b;
                fi.o oVar = j4Var.f34615h0.f39184b0;
                String str = this.f40361c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = j4Var.f34615h0.f39184b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(j4Var.f34615h0.f39184b0);
                return;
            default:
                nf.f.m(this.f40360b.L, this.f40361c, false, null);
                return;
        }
    }
}
