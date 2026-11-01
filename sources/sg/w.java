package sg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.g31;
import org.telegram.ui.q21;
import org.telegram.ui.un;
public final class w extends g31 {
    public final nj0 f48492e2;
    public final k2 f48493f2;
    public final b0 f48494g2;

    public w(b0 b0Var, k2 k2Var, Context context, int i10, boolean z10, p6 p6Var, nj0 nj0Var, k2 k2Var2) {
        super(k2Var, context, false, null, i10, z10, p6Var, 16);
        this.f48494g2 = b0Var;
        this.f48492e2 = nj0Var;
        this.f48493f2 = k2Var2;
    }

    @Override
    public final void m() {
        this.f48494g2.f48286a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ph.k kVar = this.f48494g2.f48288c;
        nj0 nj0Var = this.f48492e2;
        k2 k2Var = this.f48493f2;
        if (k2Var != null && !nj0Var.A0 && nj0Var.getWindowType() != 13 && !e20.i(k2Var.getCurrentAccount()).q()) {
            try {
                kVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new cc(kVar, null).r(document, org.telegram.messenger.i0.W2(dd.L0(2131743886, null)), dd.L0(2131747048, null), new v(this, 1)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                f5.g(e20.f15506s0).e(document);
            }
            if (l4 == null) {
                longValue = document.f19800id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f48446g = longValue;
            obj.h = longValue;
            nj0Var.l(view, obj, false);
            org.telegram.messenger.i0.v1(kVar);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f48494g2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f48287b.updateViewLayout(b0Var.f48288c, b0Var.b(true));
            }
            k2 k2Var = this.f48493f2;
            if (k2Var instanceof un) {
                ((un) k2Var).ka();
            }
            nj0 nj0Var = this.f48492e2;
            if (nj0Var.getDelegate() != null) {
                nj0Var.getDelegate().h();
            }
        }
    }

    @Override
    public final void r(q21 q21Var, o0 o0Var) {
        this.f48492e2.l(q21Var, o0Var, false);
        org.telegram.messenger.i0.v1(this.f48494g2.f48288c);
    }

    @Override
    public final boolean u() {
        nj0 nj0Var = this.f48492e2;
        if (nj0Var.getDelegate() != null) {
            return nj0Var.getDelegate().h();
        }
        return false;
    }
}
