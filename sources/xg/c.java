package xg;

import android.graphics.Color;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import wg.d;
public final class c extends d {
    public final p6 f53694s;

    public c(p6 p6Var, p6 p6Var2) {
        super(p6Var);
        this.f53694s = p6Var2;
    }

    @Override
    public final int E() {
        int a2 = a(this.d);
        p6 p6Var = this.f53694s;
        if (t6.i1(p6Var) && Color.alpha(t6.w0(t6.f21281wa, p6Var)) != 0) {
            return 0;
        }
        return a2;
    }

    @Override
    public final float b() {
        if (t6.i1(this.f53694s)) {
            return i0.N(1.0f);
        }
        return this.f52868r;
    }

    @Override
    public final float b0() {
        return i0.N(0.6f);
    }

    @Override
    public final float c() {
        if (t6.i1(this.f53694s)) {
            return i0.N(2.25f);
        }
        return this.f52867n;
    }

    @Override
    public final int h0() {
        p6 p6Var = this.f53694s;
        if (t6.i1(p6Var)) {
            return t6.w0(t6.f21316ya, p6Var);
        }
        return 0;
    }

    @Override
    public final int j0() {
        p6 p6Var = this.f53694s;
        if (t6.i1(p6Var)) {
            return t6.w0(t6.f21300xa, p6Var);
        }
        return a(this.f52864b);
    }

    @Override
    public final int u() {
        int a2 = a(this.f52865c);
        p6 p6Var = this.f53694s;
        if (t6.i1(p6Var) && Color.alpha(t6.w0(t6.f21281wa, p6Var)) != 0) {
            return 0;
        }
        return a2;
    }

    @Override
    public final int w() {
        p6 p6Var = this.f53694s;
        if (t6.i1(p6Var)) {
            return t6.w0(t6.f21281wa, p6Var);
        }
        return 0;
    }
}
