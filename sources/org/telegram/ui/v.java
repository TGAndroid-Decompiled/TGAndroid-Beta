package org.telegram.ui;

import android.text.TextUtils;
public final class v implements Runnable {
    public final int f42369a;
    public final h4 f42370b;
    public final String f42371c;

    public v(h4 h4Var, String str, int i10) {
        this.f42369a = i10;
        this.f42370b = h4Var;
        this.f42371c = str;
    }

    @Override
    public final void run() {
        switch (this.f42369a) {
            case 0:
                h4 h4Var = this.f42370b;
                zd zdVar = h4Var.f37679h0.f42897b0;
                String str = this.f42371c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                zdVar.setText(str);
                zd zdVar2 = h4Var.f37679h0.f42897b0;
                zdVar2.setSelection(zdVar2.getText().length());
                org.telegram.messenger.i0.J3(h4Var.f37679h0.f42897b0);
                return;
            default:
                gf.f.l(this.f42370b.L, this.f42371c, false, null);
                return;
        }
    }
}
