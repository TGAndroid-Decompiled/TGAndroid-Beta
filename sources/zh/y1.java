package zh;

import android.content.Context;
import bi.k7;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hc;
public final class y1 extends k7 {
    public final int f60632t3;
    public final z1 f60633u3;

    public y1(z1 z1Var, Context context, int i7, long j3, g6 g6Var, int i10) {
        super(context, i7, j3, g6Var, null);
        this.f60632t3 = i10;
        this.f60633u3 = z1Var;
    }

    @Override
    public final hc k() {
        switch (this.f60632t3) {
            case 0:
                return hc.a0(this.f60633u3.f60639a.f60292a);
            case 1:
                return hc.a0(this.f60633u3.f60639a.f60292a);
            default:
                return hc.a0(this.f60633u3.f60639a.f60292a);
        }
    }
}
