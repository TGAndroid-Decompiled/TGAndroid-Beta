package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class z implements Runnable {
    public final int f43747a;
    public final l4 f43748b;
    public final String f43749c;

    public z(l4 l4Var, String str, int i10) {
        this.f43747a = i10;
        this.f43748b = l4Var;
        this.f43749c = str;
    }

    @Override
    public final void run() {
        switch (this.f43747a) {
            case 0:
                l4 l4Var = this.f43748b;
                mh.m mVar = l4Var.f38607e0.V;
                String str = this.f43749c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                mVar.setText(str);
                mh.m mVar2 = l4Var.f38607e0.V;
                mVar2.setSelection(mVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f38607e0.V);
                return;
            default:
                af.g.m(this.f43748b.I, this.f43749c, false, null);
                return;
        }
    }
}
