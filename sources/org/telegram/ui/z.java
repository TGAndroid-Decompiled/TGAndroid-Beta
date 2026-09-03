package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class z implements Runnable {
    public final int f43742a;
    public final l4 f43743b;
    public final String f43744c;

    public z(l4 l4Var, String str, int i10) {
        this.f43742a = i10;
        this.f43743b = l4Var;
        this.f43744c = str;
    }

    @Override
    public final void run() {
        switch (this.f43742a) {
            case 0:
                l4 l4Var = this.f43743b;
                mh.m mVar = l4Var.f38512e0.V;
                String str = this.f43744c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                mVar.setText(str);
                mh.m mVar2 = l4Var.f38512e0.V;
                mVar2.setSelection(mVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f38512e0.V);
                return;
            default:
                af.g.m(this.f43743b.I, this.f43744c, false, null);
                return;
        }
    }
}
