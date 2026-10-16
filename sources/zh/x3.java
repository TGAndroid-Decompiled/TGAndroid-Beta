package zh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.m61;
import org.telegram.ui.zo0;
public final class x3 implements zo0, Utilities.Callback5 {
    public final int f51307a;
    public final Object f51308b;

    public x3(Object obj, int i10) {
        this.f51307a = i10;
        this.f51308b = obj;
    }

    @Override
    public void a(int i10) {
        switch (this.f51307a) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f51308b;
                if (i10 == 1) {
                    callback2.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 1:
                rh.r rVar = (rh.r) this.f51308b;
                if (i10 == 1) {
                    rVar.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    rVar.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                c90 c90Var = (c90) this.f51308b;
                if (i10 == 1) {
                    c90Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    c90Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m7 m7Var = (m7) this.f51308b;
        m61 m61Var = (m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        m7Var.getClass();
        if (m61Var.G instanceof TL_stars.StarsTransaction) {
            p7.i1(m7Var.getContext(), false, 0L, m7Var.f50842c, (TL_stars.StarsTransaction) m61Var.G, m7Var.f50841b);
        }
    }
}
