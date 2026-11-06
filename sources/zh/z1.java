package zh;

import android.content.Context;
import bi.k7;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
public final class z1 extends k7 {
    public final int f60535t3;
    public final a2 f60536u3;

    public z1(a2 a2Var, Context context, int i7, long j3, f6 f6Var, int i10) {
        super(context, i7, j3, f6Var, null);
        this.f60535t3 = i10;
        this.f60536u3 = a2Var;
    }

    @Override
    public final hc k() {
        switch (this.f60535t3) {
            case 0:
                return hc.a0(this.f60536u3.f60106a.f60212a);
            case 1:
                return hc.a0(this.f60536u3.f60106a.f60212a);
            default:
                return hc.a0(this.f60536u3.f60106a.f60212a);
        }
    }
}
