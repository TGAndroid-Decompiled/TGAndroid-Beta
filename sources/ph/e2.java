package ph;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
public final class e2 extends rh.e4 {
    public final int f45038t3;
    public final f2 f45039u3;

    public e2(f2 f2Var, Context context, int i10, long j10, p6 p6Var, int i11) {
        super(context, i10, j10, p6Var, null);
        this.f45038t3 = i11;
        this.f45039u3 = f2Var;
    }

    @Override
    public final cc k() {
        switch (this.f45038t3) {
            case 0:
                return cc.a0(this.f45039u3.f45053a.f45139a);
            case 1:
                return cc.a0(this.f45039u3.f45053a.f45139a);
            default:
                return cc.a0(this.f45039u3.f45053a.f45139a);
        }
    }
}
