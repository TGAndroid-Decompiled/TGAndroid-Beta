package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ha;
public final class w0 extends rh.e4 {
    public final int f45343t3 = 0;
    public final ha f45344u3;

    public w0(l1 l1Var, Context context, int i10, long j10, p6 p6Var) {
        super(context, i10, j10, p6Var, null);
        this.f45344u3 = l1Var;
    }

    @Override
    public int R() {
        switch (this.f45343t3) {
            case 1:
                return ((rh.e4) this.f45344u3).R();
            default:
                return super.R();
        }
    }

    @Override
    public cc k() {
        switch (this.f45343t3) {
            case 0:
                l1 l1Var = (l1) this.f45344u3;
                return new cc(l1Var.f21589c, l1Var.I0);
            default:
                return super.k();
        }
    }

    public w0(rh.e4 e4Var, Context context, int i10, long j10, p6 p6Var, View view) {
        super(context, i10, j10, p6Var, view);
        this.f45344u3 = e4Var;
    }
}
