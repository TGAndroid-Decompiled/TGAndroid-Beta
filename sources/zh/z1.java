package zh;

import android.content.Context;
import bi.k7;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
public final class z1 extends k7 {
    public final int f60510t3;
    public final a2 f60511u3;

    public z1(a2 a2Var, Context context, int i7, long j3, f6 f6Var, int i10) {
        super(context, i7, j3, f6Var, null);
        this.f60510t3 = i10;
        this.f60511u3 = a2Var;
    }

    @Override
    public final hc k() {
        switch (this.f60510t3) {
            case 0:
                return hc.a0(this.f60511u3.f60081a.f60187a);
            case 1:
                return hc.a0(this.f60511u3.f60081a.f60187a);
            default:
                return hc.a0(this.f60511u3.f60081a.f60187a);
        }
    }
}
