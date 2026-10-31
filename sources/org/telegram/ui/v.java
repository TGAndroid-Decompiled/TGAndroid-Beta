package org.telegram.ui;

import android.text.TextUtils;
public final class v implements Runnable {
    public final int f42556a;
    public final h4 f42557b;
    public final String f42558c;

    public v(h4 h4Var, String str, int i10) {
        this.f42556a = i10;
        this.f42557b = h4Var;
        this.f42558c = str;
    }

    @Override
    public final void run() {
        switch (this.f42556a) {
            case 0:
                h4 h4Var = this.f42557b;
                zd zdVar = h4Var.f37734h0.f43095b0;
                String str = this.f42558c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                zdVar.setText(str);
                zd zdVar2 = h4Var.f37734h0.f43095b0;
                zdVar2.setSelection(zdVar2.getText().length());
                org.telegram.messenger.i0.J3(h4Var.f37734h0.f43095b0);
                return;
            default:
                gf.f.l(this.f42557b.L, this.f42558c, false, null);
                return;
        }
    }
}
