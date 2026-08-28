package pf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vk0;
public final class c0 extends vk0 {
    public final Context f45585c;
    public final ArrayList d = new ArrayList();
    public String f45586e;
    public final e0 f45587f;

    public c0(e0 e0Var, Context context) {
        this.f45587f = e0Var;
        this.f45585c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.size() + 2;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == h() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void l() {
        super.l();
        this.f45587f.K();
    }

    @Override
    public final void v(f2.q1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: pf.c0.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m1Var;
        Context context = this.f45585c;
        if (i9 != 0) {
            if (i9 != 1) {
                m1Var = new View(context);
                m1Var.setTag(-33024);
            } else {
                m1Var = new View(context);
                m1Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
                m1Var.setTag(-33024);
            }
        } else {
            m1Var = new m1(context, this.f45587f.f27492a, false);
        }
        return new f2.q1(m1Var);
    }
}
