package tg;

import android.content.Context;
public final class b0 extends hi.r2 {
    public final l0 E1;

    public b0(l0 l0Var, Context context, p pVar) {
        super(context, pVar, false, false);
        this.E1 = l0Var;
    }

    @Override
    public final boolean K0(Integer num) {
        if (num.intValue() == 6) {
            hi.a0 a0Var = this.E1.J1;
            if (a0Var != null && a0Var.c()) {
                return true;
            }
            return false;
        } else if (num.intValue() == 2) {
            return true;
        } else {
            return false;
        }
    }
}
