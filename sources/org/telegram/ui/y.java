package org.telegram.ui;

import android.text.TextUtils;
public final class y implements Runnable {
    public final int f52135a;
    public final i4 f52136b;
    public final String f52137c;

    public y(i4 i4Var, String str, int i3) {
        this.f52135a = i3;
        this.f52136b = i4Var;
        this.f52137c = str;
    }

    @Override
    public final void run() {
        switch (this.f52135a) {
            case 0:
                i4 i4Var = this.f52136b;
                ci.s sVar = i4Var.f46088i0.f50875c0;
                String str = this.f52137c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                sVar.setText(str);
                ci.s sVar2 = i4Var.f46088i0.f50875c0;
                sVar2.setSelection(sVar2.getText().length());
                org.telegram.messenger.g0.K3(i4Var.f46088i0.f50875c0);
                return;
            default:
                sf.c.n(this.f52136b.M, this.f52137c, false, null);
                return;
        }
    }
}
