package qf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

public final class c0 extends yk0 {

    public final Context f46255c;
    public final ArrayList d = new ArrayList();

    public String f46256e;

    public final e0 f46257f;

    public c0(e0 e0Var, Context context) {
        this.f46257f = e0Var;
        this.f46255c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    @Override
    public final int h() {
        return this.d.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override
    public final void l() {
        super.l();
        this.f46257f.L();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        Object obj;
        if (o1Var.f5793f == 0) {
            m1 m1Var = (m1) o1Var.f5789a;
            boolean z10 = i10 != h() + (-2);
            int i11 = i10 - 1;
            if (i11 >= 0) {
                ArrayList arrayList = this.d;
                if (i11 >= arrayList.size()) {
                    obj = null;
                } else {
                    obj = arrayList.get(i11);
                }
            } else {
                obj = null;
            }
            if (obj instanceof p1) {
                p1 p1Var = (p1) obj;
                m1Var.a(p1Var, this.f46256e, z10);
                m1Var.d.a(this.f46257f.f46281w.contains(Integer.valueOf(p1Var.f46418a)), false);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View m1Var;
        Context context = this.f46255c;
        if (i10 == 0) {
            m1Var = new m1(context, this.f46257f.f34899a, false);
        } else if (i10 != 1) {
            m1Var = new View(context);
            m1Var.setTag(-33024);
        } else {
            m1Var = new View(context);
            m1Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            m1Var.setTag(-33024);
        }
        return new lk0(m1Var);
    }
}
