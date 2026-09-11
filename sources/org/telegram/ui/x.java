package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f42520a;
    public final i4 f42521b;
    public final String f42522c;

    public x(i4 i4Var, String str, int i10) {
        this.f42520a = i10;
        this.f42521b = i4Var;
        this.f42522c = str;
    }

    @Override
    public final void run() {
        switch (this.f42520a) {
            case 0:
                i4 i4Var = this.f42521b;
                gi.o oVar = i4Var.f37220h0.f42277b0;
                String str = this.f42522c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                gi.o oVar2 = i4Var.f37220h0.f42277b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f37220h0.f42277b0);
                return;
            default:
                of.f.m(this.f42521b.L, this.f42522c, false, null);
                return;
        }
    }
}
