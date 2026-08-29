package sf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.il0;
public final class b0 extends il0 {
    public final Context f47751c;
    public final ArrayList d = new ArrayList();
    public String f47752e;
    public final d0 f47753f;

    public b0(d0 d0Var, Context context) {
        this.f47753f = d0Var;
        this.f47751c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
            return true;
        }
        return false;
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
        if (i10 == h() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void l() {
        super.l();
        this.f47753f.K();
    }

    @Override
    public final void v(f2.n1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: sf.b0.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View m1Var;
        Context context = this.f47751c;
        if (i10 != 0) {
            if (i10 != 1) {
                m1Var = new View(context);
                m1Var.setTag(-33024);
            } else {
                m1Var = new View(context);
                m1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                m1Var.setTag(-33024);
            }
        } else {
            m1Var = new m1(context, this.f47753f.f28402a, false);
        }
        return new f2.n1(m1Var);
    }
}
