package xg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Wallet.f2;
public final class m0 extends sj0 {
    public final q0 f58730c;

    public m0(q0 q0Var) {
        this.f58730c = q0Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f58730c.R1.size() + 3;
    }

    @Override
    public final int d(int i3) {
        if (i3 != 0) {
            int i10 = 1;
            if (i3 != 1) {
                i10 = 2;
                if (i3 != 2) {
                    return 3;
                }
            }
            return i10;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        q0 q0Var = this.f58730c;
        if (i10 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) q0Var.R1.get(i3 - 3);
            bh.p pVar = (bh.p) view;
            pVar.setBoost(tL_myBoost);
            pVar.c(q0Var.Q1.contains(tL_myBoost), false);
        } else if (i10 == 2) {
            n4 n4Var = (n4) view;
            n4Var.setTextSize(15.0f);
            n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            n4Var.setText(bd.M0(2131753295, null));
        } else if (i10 == 0) {
            p0 p0Var = (p0) view;
            q0Var.U1 = p0Var;
            TLRPC.Chat chat = q0Var.S1;
            s70 s70Var = p0Var.f58749e;
            try {
                int i11 = (int) hp.s1(h10.f22829t0).f23114s0;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.G(i11, "BoostingReassignBoostTextPluralWithLink", str, "%3$s"));
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(bd.M0(2131753320, "BoostingReassignBoostTextLink"), k6.Uc, 2, new e2(q0Var, 3), null);
                int indexOf = TextUtils.indexOf(X2, "%3$s");
                X2.replace(indexOf, indexOf + 4, (CharSequence) S2);
                s70Var.setText(X2, TextView.BufferType.EDITABLE);
                s70Var.post(new f2(p0Var, indexOf, 11));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        Context context = viewGroup.getContext();
        q0 q0Var = this.f58730c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        view = new View(context);
                    } else {
                        view = new bh.p(context, true, false, q0Var.J0, true);
                    }
                } else {
                    view = new n4(context, 22);
                }
            } else {
                int i10 = k6.f27824a7;
                view = new x6(context, k6.x0(null, i10, false), 0);
                r6.i(i10, view, null);
            }
        } else {
            p0 p0Var = new p0(context);
            p0Var.a(q0Var.Q1, q0Var.S1);
            view = p0Var;
        }
        return p1.p(view, view, -1, -2);
    }
}
