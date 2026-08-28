package zf;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vk0;
public final class l1 extends vk0 {
    public final s0 f50603c;

    public l1(s0 s0Var) {
        this.f50603c = s0Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        s0 s0Var = this.f50603c;
        ArrayList arrayList = s0Var.T2;
        if (arrayList.isEmpty()) {
            return;
        }
        n1 n1Var = (n1) q1Var.f5501a;
        n1Var.f50627r = (TLRPC.Document) arrayList.get(i9 % arrayList.size());
        n1Var.f50628s = true;
        n1Var.a(true ^ s0Var.Y2, false, false);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        n1 n1Var = new n1(this.f50603c, viewGroup.getContext());
        n1Var.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(n1Var);
    }
}
