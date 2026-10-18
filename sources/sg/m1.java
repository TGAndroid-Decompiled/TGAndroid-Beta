package sg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hm0;
public final class m1 extends hm0 {
    public final s0 f46370c;

    public m1(s0 s0Var) {
        this.f46370c = s0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        s0 s0Var = this.f46370c;
        ArrayList arrayList = s0Var.V2;
        if (arrayList.isEmpty()) {
            return;
        }
        o1 o1Var = (o1) b1Var.f45958a;
        o1Var.f46392r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        o1Var.f46393s = true;
        o1Var.a(true ^ s0Var.f46407a3, false, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(this.f46370c, viewGroup.getContext());
        o1Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(o1Var);
    }
}
