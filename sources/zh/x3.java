package zh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.l61;
import org.telegram.ui.bp0;
public final class x3 implements bp0, Utilities.Callback5 {
    public final int f51306a;
    public final Object f51307b;

    public x3(Object obj, int i10) {
        this.f51306a = i10;
        this.f51307b = obj;
    }

    @Override
    public void a(int i10) {
        switch (this.f51306a) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f51307b;
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
                rh.s sVar = (rh.s) this.f51307b;
                if (i10 == 1) {
                    sVar.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    sVar.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                d90 d90Var = (d90) this.f51307b;
                if (i10 == 1) {
                    d90Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    d90Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m7 m7Var = (m7) this.f51307b;
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        m7Var.getClass();
        if (l61Var.G instanceof TL_stars.StarsTransaction) {
            p7.i1(m7Var.getContext(), false, 0L, m7Var.f50841c, (TL_stars.StarsTransaction) l61Var.G, m7Var.f50840b);
        }
    }
}
