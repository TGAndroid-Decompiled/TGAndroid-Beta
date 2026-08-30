package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class z implements Runnable {
    public final int f40615a;
    public final l4 f40616b;
    public final String f40617c;

    public z(l4 l4Var, String str, int i10) {
        this.f40615a = i10;
        this.f40616b = l4Var;
        this.f40617c = str;
    }

    @Override
    public final void run() {
        switch (this.f40615a) {
            case 0:
                l4 l4Var = this.f40616b;
                lh.n nVar = l4Var.f35933e0.V;
                String str = this.f40617c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                nVar.setText(str);
                lh.n nVar2 = l4Var.f35933e0.V;
                nVar2.setSelection(nVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f35933e0.V);
                return;
            default:
                af.g.m(this.f40616b.I, this.f40617c, false, null);
                return;
        }
    }
}
