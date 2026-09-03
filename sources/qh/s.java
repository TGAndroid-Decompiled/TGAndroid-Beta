package qh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
public final class s extends f2.p0 {
    public final Context f46052c;
    public final c2 d;
    public final u f46053e;

    public s(u uVar, Context context, c2 c2Var) {
        this.f46053e = uVar;
        this.f46052c = context;
        this.d = c2Var;
    }

    @Override
    public final int h() {
        return r.a().size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        t tVar = (t) m1Var.f5875a;
        r rVar = (r) r.a().get(i10);
        if (i10 == tVar.f46114s) {
            z4 = true;
        } else {
            z4 = false;
        }
        tVar.setDrawable(new lc0(rVar, false));
        tVar.b(rVar.equals(this.f46053e.f46150b), z4);
        tVar.f46114s = i10;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ma maVar = new ma(this.f46052c);
        maVar.setLayoutParams(new f2.x0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        maVar.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        return new f2.m1(maVar);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        t tVar = (t) m1Var.f5875a;
        this.d.a(tVar);
        int i10 = tVar.f46114s;
        if (i10 >= 0 && i10 < r.a().size()) {
            r rVar = (r) r.a().get(tVar.f46114s);
            tVar.setDrawable(new lc0(rVar, false));
            tVar.b(rVar.equals(this.f46053e.f46150b), false);
        }
    }

    @Override
    public final void z(f2.m1 m1Var) {
        this.d.d.remove((t) m1Var.f5875a);
    }
}
