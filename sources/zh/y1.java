package zh;

import android.content.Context;
import bi.k7;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gc;
public final class y1 extends k7 {
    public final int f60644w3;
    public final z1 f60645x3;

    public y1(z1 z1Var, Context context, int i7, long j3, h6 h6Var, int i10) {
        super(context, i7, j3, h6Var, null);
        this.f60644w3 = i10;
        this.f60645x3 = z1Var;
    }

    @Override
    public final gc k() {
        switch (this.f60644w3) {
            case 0:
                return gc.a0(this.f60645x3.f60651a.f60294a);
            case 1:
                return gc.a0(this.f60645x3.f60651a.f60294a);
            default:
                return gc.a0(this.f60645x3.f60651a.f60294a);
        }
    }
}
