package vh;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.sk0;
public final class b6 extends sk0 {
    public final c6 f51004c;

    public b6(c6 c6Var) {
        this.f51004c = c6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f51004c.f51035j1.size() + 2;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: vh.b6.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        int L;
        View view;
        c6 c6Var = this.f51004c;
        if (i10 != 0 && i10 != 1) {
            view = new v6(c6Var.getContext(), c6Var.I0);
        } else {
            View view2 = new View(c6Var.getContext());
            if (i10 == 0) {
                L = (org.telegram.messenger.i0.f16026q.y + org.telegram.messenger.i0.f16020m) - org.telegram.messenger.i0.L(306.0f);
            } else {
                L = org.telegram.messenger.i0.L(54.0f);
            }
            view2.setLayoutParams(new s4.o0(-1, L));
            view = view2;
        }
        return new s4.c1(view);
    }
}
