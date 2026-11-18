package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.jw0;
import v4.f1;
public final class m0 extends bk0 {
    public final q0 f59793c;

    public m0(q0 q0Var) {
        this.f59793c = q0Var;
    }

    @Override
    public final boolean D(f1 f1Var) {
        if (f1Var.f59127f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f59793c.U1.size() + 3;
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
    public final void t(f1 f1Var, int i7) {
        String str;
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        q0 q0Var = this.f59793c;
        if (i10 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) q0Var.U1.get(i7 - 3);
            ah.r rVar = (ah.r) view;
            rVar.setBoost(tL_myBoost);
            rVar.c(q0Var.T1.contains(tL_myBoost), false);
        } else if (i10 == 2) {
            o4 o4Var = (o4) view;
            o4Var.setTextSize(15.0f);
            o4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            o4Var.setText(gd.M0(2131753293, null));
        } else if (i10 == 0) {
            p0 p0Var = (p0) view;
            q0Var.X1 = p0Var;
            TLRPC.Chat chat = q0Var.V1;
            k80 k80Var = p0Var.f59810e;
            try {
                int i11 = (int) mp.u1(j10.f24770t0).f25755s0;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.G(i11, "BoostingReassignBoostTextPluralWithLink", str, "%3$s"));
                SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(gd.M0(2131753318, "BoostingReassignBoostTextLink"), n6.Xc, 2, new i2(q0Var, 3), null);
                int indexOf = TextUtils.indexOf(W2, "%3$s");
                W2.replace(indexOf, indexOf + 4, (CharSequence) R2);
                k80Var.setText(W2, TextView.BufferType.EDITABLE);
                k80Var.post(new jw0(p0Var, indexOf, 16));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        q0 q0Var = this.f59793c;
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
                int i10 = n6.f29337a7;
                view = new z6(context, n6.x0(null, i10, false), 0);
                u6.h(i10, view, null);
            }
        } else {
            p0 p0Var = new p0(context);
            p0Var.a(q0Var.T1, q0Var.V1);
            view = p0Var;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
