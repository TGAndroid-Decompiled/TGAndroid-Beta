package ph;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
public final class s extends f2.o0 {
    public final Context f42297c;
    public final d2 d;
    public final u e;

    public s(u uVar, Context context, d2 d2Var) {
        this.e = uVar;
        this.f42297c = context;
        this.d = d2Var;
    }

    @Override
    public final int h() {
        return r.a().size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        t tVar = (t) l1Var.f5774a;
        r rVar = (r) r.a().get(i10);
        if (i10 == tVar.f42382s) {
            z4 = true;
        } else {
            z4 = false;
        }
        tVar.setDrawable(new kc0(rVar, false));
        tVar.b(rVar.equals(this.e.f42457b), z4);
        tVar.f42382s = i10;
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        pa paVar = new pa(this.f42297c);
        paVar.setLayoutParams(new f2.w0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        paVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        return new f2.l1(paVar);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        t tVar = (t) l1Var.f5774a;
        this.d.a(tVar);
        int i10 = tVar.f42382s;
        if (i10 >= 0 && i10 < r.a().size()) {
            r rVar = (r) r.a().get(tVar.f42382s);
            tVar.setDrawable(new kc0(rVar, false));
            tVar.b(rVar.equals(this.e.f42457b), false);
        }
    }

    @Override
    public final void z(f2.l1 l1Var) {
        this.d.d.remove((t) l1Var.f5774a);
    }
}
