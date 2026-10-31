package qh;

import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
public final class w implements Runnable {
    public final int f45791a = 1;
    public final String f45792b;
    public final q20 f45793c;
    public final k2 d;

    public w(String str, q20 q20Var, k2 k2Var) {
        this.f45792b = str;
        this.f45793c = q20Var;
        this.d = k2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f45791a;
        k2 k2Var = this.d;
        q20 q20Var = this.f45793c;
        String str = this.f45792b;
        switch (i10) {
            case 0:
                y.p(k2Var, 0, new w(str, q20Var, k2Var));
                return;
            default:
                if (str != null) {
                    q20Var.a(str);
                    return;
                } else {
                    cc.a0(k2Var).N(cd.L0(2131745878, null), cd.L0(2131751106, null)).j();
                    return;
                }
        }
    }

    public w(k2 k2Var, String str, q20 q20Var) {
        this.d = k2Var;
        this.f45792b = str;
        this.f45793c = q20Var;
    }
}
