package rh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.r20;
public final class r0 implements View.OnClickListener {
    public final int f47405a;
    public final int f47406b;
    public final View f47407c;

    public r0(View view, int i10, int i11) {
        this.f47405a = i11;
        this.f47407c = view;
        this.f47406b = i10;
    }

    @Override
    public final void onClick(View view) {
        r20 r20Var;
        switch (this.f47405a) {
            case 0:
                ((s0) this.f47407c).a(this.f47406b);
                return;
            case 1:
                vh.k7 k7Var = (vh.k7) this.f47407c;
                ArrayList arrayList = k7Var.e;
                int i10 = this.f47406b;
                if (arrayList.contains(Integer.valueOf(i10))) {
                    if (k7Var.e.size() > 1) {
                        k7Var.e.remove(Integer.valueOf(i10));
                    } else {
                        return;
                    }
                } else {
                    k7Var.e.add(Integer.valueOf(i10));
                }
                org.telegram.messenger.i0.d0(k7Var.f52207b, new ph.h1(k7Var, 24));
                return;
            default:
                vh.f4 f4Var = ((vh.d4) this.f47407c).f51092b;
                if (f4Var.f51151r && (r20Var = f4Var.f51149f) != null) {
                    r20Var.a(Integer.valueOf(this.f47406b));
                    return;
                }
                return;
        }
    }
}
