package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.nb1;
import v4.e1;
public final class k0 extends tj0 {
    public final o0 f59201c;

    public k0(o0 o0Var) {
        this.f59201c = o0Var;
    }

    @Override
    public final boolean D(e1 e1Var) {
        if (e1Var.f58539f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f59201c.U1.size() + 3;
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
    public final void t(e1 e1Var, int i7) {
        String str;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        o0 o0Var = this.f59201c;
        if (i10 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) o0Var.U1.get(i7 - 3);
            ah.r rVar = (ah.r) view;
            rVar.setBoost(tL_myBoost);
            rVar.c(o0Var.T1.contains(tL_myBoost), false);
        } else if (i10 == 2) {
            n4 n4Var = (n4) view;
            n4Var.setTextSize(15.0f);
            n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            n4Var.setText(hd.M0(2131753295, null));
        } else if (i10 == 0) {
            n0 n0Var = (n0) view;
            o0Var.X1 = n0Var;
            TLRPC.Chat chat = o0Var.V1;
            z70 z70Var = n0Var.f59221e;
            try {
                int i11 = (int) np.s1(m10.f24940t0).f25389s0;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.G(i11, "BoostingReassignBoostTextPluralWithLink", str, "%3$s"));
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(hd.M0(2131753320, "BoostingReassignBoostTextLink"), j6.Xc, 2, new f2(o0Var, 3), null);
                int indexOf = TextUtils.indexOf(X2, "%3$s");
                X2.replace(indexOf, indexOf + 4, (CharSequence) S2);
                z70Var.setText(X2, TextView.BufferType.EDITABLE);
                z70Var.post(new nb1(n0Var, indexOf, 13));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        o0 o0Var = this.f59201c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        view = new View(context);
                    } else {
                        view = new ah.r(context, true, false, o0Var.J0, true);
                    }
                } else {
                    view = new n4(context, 22);
                }
            } else {
                int i10 = j6.f28792a7;
                view = new x6(context, j6.x0(null, i10, false), 0);
                q6.h(i10, view, null);
            }
        } else {
            n0 n0Var = new n0(context);
            n0Var.a(o0Var.T1, o0Var.V1);
            view = n0Var;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
