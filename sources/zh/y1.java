package zh;

import android.content.Context;
import bi.k7;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
public final class y1 extends k7 {
    public final int f60614t3;
    public final z1 f60615u3;

    public y1(z1 z1Var, Context context, int i7, long j3, f6 f6Var, int i10) {
        super(context, i7, j3, f6Var, null);
        this.f60614t3 = i10;
        this.f60615u3 = z1Var;
    }

    @Override
    public final hc k() {
        switch (this.f60614t3) {
            case 0:
                return hc.a0(this.f60615u3.f60621a.f60282a);
            case 1:
                return hc.a0(this.f60615u3.f60621a.f60282a);
            default:
                return hc.a0(this.f60615u3.f60621a.f60282a);
        }
    }
}
