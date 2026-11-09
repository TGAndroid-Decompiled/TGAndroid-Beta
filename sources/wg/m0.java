package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Wallet.f2;
public final class m0 extends pj0 {
    public final q0 f57778c;

    public m0(q0 q0Var) {
        this.f57778c = q0Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f57778c.Q1.size() + 3;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            int i10 = 1;
            if (i7 != 1) {
                i10 = 2;
                if (i7 != 2) {
                    return 3;
                }
            }
            return i10;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        int i10 = d1Var.f57060f;
        View view = d1Var.f57056a;
        q0 q0Var = this.f57778c;
        if (i10 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) q0Var.Q1.get(i7 - 3);
            ah.r rVar = (ah.r) view;
            rVar.setBoost(tL_myBoost);
            rVar.c(q0Var.P1.contains(tL_myBoost), false);
        } else if (i10 == 2) {
            n4 n4Var = (n4) view;
            n4Var.setTextSize(15.0f);
            n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            n4Var.setText(id.M0(2131753295, null));
        } else if (i10 == 0) {
            p0 p0Var = (p0) view;
            q0Var.T1 = p0Var;
            TLRPC.Chat chat = q0Var.R1;
            x70 x70Var = p0Var.f57795e;
            try {
                int i11 = (int) qp.s1(p10.f24470s0).f24880r0;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.G(i11, "BoostingReassignBoostTextPluralWithLink", str, "%3$s"));
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(id.M0(2131753320, "BoostingReassignBoostTextLink"), l6.Uc, 2, new g2(q0Var, 3), null);
                int indexOf = TextUtils.indexOf(X2, "%3$s");
                X2.replace(indexOf, indexOf + 4, (CharSequence) S2);
                x70Var.setText(X2, TextView.BufferType.EDITABLE);
                x70Var.post(new f2(p0Var, indexOf, 10));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        q0 q0Var = this.f57778c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        view = new View(context);
                    } else {
                        view = new ah.r(context, true, false, q0Var.I0, true);
                    }
                } else {
                    view = new n4(context, 22);
                }
            } else {
                int i10 = l6.f27809a7;
                view = new y6(context, l6.x0(null, i10, false), 0);
                s6.h(i10, view, null);
            }
        } else {
            p0 p0Var = new p0(context);
            p0Var.a(q0Var.P1, q0Var.R1);
            view = p0Var;
        }
        return jg.g.r(view, view, -1, -2);
    }
}
