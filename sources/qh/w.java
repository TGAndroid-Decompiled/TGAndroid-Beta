package qh;

import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
public final class w implements Runnable {
    public final int f45802a = 1;
    public final String f45803b;
    public final r20 f45804c;
    public final k2 d;

    public w(String str, r20 r20Var, k2 k2Var) {
        this.f45803b = str;
        this.f45804c = r20Var;
        this.d = k2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f45802a;
        k2 k2Var = this.d;
        r20 r20Var = this.f45804c;
        String str = this.f45803b;
        switch (i10) {
            case 0:
                y.p(k2Var, 0, new w(str, r20Var, k2Var));
                return;
            default:
                if (str != null) {
                    r20Var.a(str);
                    return;
                } else {
                    cc.a0(k2Var).N(dd.L0(2131745878, null), dd.L0(2131751106, null)).j();
                    return;
                }
        }
    }

    public w(k2 k2Var, String str, r20 r20Var) {
        this.d = k2Var;
        this.f45803b = str;
        this.f45804c = r20Var;
    }
}
