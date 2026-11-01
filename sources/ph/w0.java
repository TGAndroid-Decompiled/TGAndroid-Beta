package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ha;
public final class w0 extends rh.e4 {
    public final int f45354t3 = 0;
    public final ha f45355u3;

    public w0(l1 l1Var, Context context, int i10, long j10, p6 p6Var) {
        super(context, i10, j10, p6Var, null);
        this.f45355u3 = l1Var;
    }

    @Override
    public int R() {
        switch (this.f45354t3) {
            case 1:
                return ((rh.e4) this.f45355u3).R();
            default:
                return super.R();
        }
    }

    @Override
    public cc k() {
        switch (this.f45354t3) {
            case 0:
                l1 l1Var = (l1) this.f45355u3;
                return new cc(l1Var.f21590c, l1Var.I0);
            default:
                return super.k();
        }
    }

    public w0(rh.e4 e4Var, Context context, int i10, long j10, p6 p6Var, View view) {
        super(context, i10, j10, p6Var, view);
        this.f45355u3 = e4Var;
    }
}
