package sg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.i31;
import org.telegram.ui.s21;
import org.telegram.ui.un;
public final class w extends i31 {
    public final mj0 f48481e2;
    public final k2 f48482f2;
    public final b0 f48483g2;

    public w(b0 b0Var, k2 k2Var, Context context, int i10, boolean z10, p6 p6Var, mj0 mj0Var, k2 k2Var2) {
        super(k2Var, context, false, null, i10, z10, p6Var, 16);
        this.f48483g2 = b0Var;
        this.f48481e2 = mj0Var;
        this.f48482f2 = k2Var2;
    }

    @Override
    public final void m() {
        this.f48483g2.f48275a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ph.k kVar = this.f48483g2.f48277c;
        mj0 mj0Var = this.f48481e2;
        k2 k2Var = this.f48482f2;
        if (k2Var != null && !mj0Var.A0 && mj0Var.getWindowType() != 13 && !d20.i(k2Var.getCurrentAccount()).q()) {
            try {
                kVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new cc(kVar, null).r(document, org.telegram.messenger.i0.W2(cd.L0(2131743886, null)), cd.L0(2131747048, null), new v(this, 1)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                f5.g(d20.f15147s0).e(document);
            }
            if (l4 == null) {
                longValue = document.f19799id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f48435g = longValue;
            obj.h = longValue;
            mj0Var.l(view, obj, false);
            org.telegram.messenger.i0.v1(kVar);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f48483g2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f48276b.updateViewLayout(b0Var.f48277c, b0Var.b(true));
            }
            k2 k2Var = this.f48482f2;
            if (k2Var instanceof un) {
                ((un) k2Var).fa();
            }
            mj0 mj0Var = this.f48481e2;
            if (mj0Var.getDelegate() != null) {
                mj0Var.getDelegate().h();
            }
        }
    }

    @Override
    public final void r(s21 s21Var, o0 o0Var) {
        this.f48481e2.l(s21Var, o0Var, false);
        org.telegram.messenger.i0.v1(this.f48483g2.f48277c);
    }

    @Override
    public final boolean u() {
        mj0 mj0Var = this.f48481e2;
        if (mj0Var.getDelegate() != null) {
            return mj0Var.getDelegate().h();
        }
        return false;
    }
}
