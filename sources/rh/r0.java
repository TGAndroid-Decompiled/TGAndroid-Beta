package rh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.q20;
public final class r0 implements View.OnClickListener {
    public final int f47392a;
    public final int f47393b;
    public final View f47394c;

    public r0(View view, int i10, int i11) {
        this.f47392a = i11;
        this.f47394c = view;
        this.f47393b = i10;
    }

    @Override
    public final void onClick(View view) {
        q20 q20Var;
        switch (this.f47392a) {
            case 0:
                ((s0) this.f47394c).a(this.f47393b);
                return;
            case 1:
                vh.k7 k7Var = (vh.k7) this.f47394c;
                ArrayList arrayList = k7Var.e;
                int i10 = this.f47393b;
                if (arrayList.contains(Integer.valueOf(i10))) {
                    if (k7Var.e.size() > 1) {
                        k7Var.e.remove(Integer.valueOf(i10));
                    } else {
                        return;
                    }
                } else {
                    k7Var.e.add(Integer.valueOf(i10));
                }
                org.telegram.messenger.i0.d0(k7Var.f52192b, new ph.h1(k7Var, 24));
                return;
            default:
                vh.f4 f4Var = ((vh.d4) this.f47394c).f51077b;
                if (f4Var.f51136r && (q20Var = f4Var.f51134f) != null) {
                    q20Var.a(Integer.valueOf(this.f47393b));
                    return;
                }
                return;
        }
    }
}
