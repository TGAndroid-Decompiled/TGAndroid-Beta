package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.zn0;
public final class m0 extends dk0 {
    public final q0 f59803c;

    public m0(q0 q0Var) {
        this.f59803c = q0Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f59803c.U1.size() + 3;
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
    public final void t(v4.e1 e1Var, int i7) {
        String str;
        int i10 = e1Var.f59115f;
        View view = e1Var.f59111a;
        q0 q0Var = this.f59803c;
        if (i10 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) q0Var.U1.get(i7 - 3);
            ah.r rVar = (ah.r) view;
            rVar.setBoost(tL_myBoost);
            rVar.c(q0Var.T1.contains(tL_myBoost), false);
        } else if (i10 == 2) {
            o4 o4Var = (o4) view;
            o4Var.setTextSize(15.0f);
            o4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            o4Var.setText(hd.N0(2131753292, null));
        } else if (i10 == 0) {
            p0 p0Var = (p0) view;
            q0Var.X1 = p0Var;
            TLRPC.Chat chat = q0Var.V1;
            m80 m80Var = p0Var.f59821e;
            try {
                int i11 = (int) np.u1(k10.f24932t0).f25918s0;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.G(i11, "BoostingReassignBoostTextPluralWithLink", str, "%3$s"));
                SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(hd.N0(2131753317, "BoostingReassignBoostTextLink"), m6.Xc, 2, new h2(q0Var, 3), null);
                int indexOf = TextUtils.indexOf(W2, "%3$s");
                W2.replace(indexOf, indexOf + 4, (CharSequence) R2);
                m80Var.setText(W2, TextView.BufferType.EDITABLE);
                m80Var.post(new zn0(p0Var, indexOf, 18));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        q0 q0Var = this.f59803c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        view = new View(context);
                    } else {
                        view = new ah.r(context, true, false, q0Var.J0, true);
                    }
                } else {
                    view = new o4(context, 22);
                }
            } else {
                int i10 = m6.f29290a7;
                view = new z6(context, m6.x0(null, i10, false), 0);
                t6.h(i10, view, null);
            }
        } else {
            p0 p0Var = new p0(context);
            p0Var.a(q0Var.T1, q0Var.V1);
            view = p0Var;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
