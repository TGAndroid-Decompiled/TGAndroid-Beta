package vf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;
public final class a0 extends sl0 {
    public final Context f48975c;
    public final ArrayList d = new ArrayList();
    public String f48976e;
    public final c0 f48977f;

    public a0(c0 c0Var, Context context) {
        this.f48977f = c0Var;
        this.f48975c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
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
        this.f48977f.K();
    }

    @Override
    public final void v(f2.m1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: vf.a0.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View l1Var;
        Context context = this.f48975c;
        if (i10 != 0) {
            if (i10 != 1) {
                l1Var = new View(context);
                l1Var.setTag(-33024);
            } else {
                l1Var = new View(context);
                l1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                l1Var.setTag(-33024);
            }
        } else {
            l1Var = new l1(context, this.f48977f.f26545a, false);
        }
        return new f2.m1(l1Var);
    }
}
