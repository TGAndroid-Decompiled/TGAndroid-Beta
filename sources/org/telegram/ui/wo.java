package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class wo extends u4.h0 {
    public final Context f51577c;
    public final xo d;

    public wo(xo xoVar, Context context) {
        this.d = xoVar;
        this.f51577c = context;
    }

    @Override
    public final int b() {
        int i3;
        xo xoVar = this.d;
        if (!xoVar.d.isEmpty()) {
            i3 = xoVar.f52062n.size() + 1;
        } else {
            i3 = 0;
        }
        return i3 + 2;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 3;
        }
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        View view = d1Var.f55540a;
        int d = d(i3);
        xo xoVar = this.d;
        if (d != 0) {
            if (d != 1) {
                if (d == 2) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) xoVar.f52062n.get(i3 - 3);
                    boolean contains = xoVar.d.contains(tL_availableReaction.reaction);
                    i10 = ((org.telegram.ui.ActionBar.d2) xoVar).currentAccount;
                    ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i10);
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(2131747830, null));
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        org.telegram.ui.ActionBar.r6.V(y8Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, null);
        int i11 = xoVar.f52064s;
        if (i11 == 1) {
            y8Var.setText(org.telegram.messenger.bd.M0(2131751148, null));
        } else if (i11 == 0) {
            y8Var.setText(org.telegram.messenger.bd.M0(2131751160, null));
        } else if (i11 == 2) {
            y8Var.setText(org.telegram.messenger.bd.M0(2131751430, null));
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = this.f51577c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 3) {
                    return new u4.d1(new org.telegram.ui.Cells.x(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                xo xoVar = this.d;
                org.telegram.messenger.g0.E2(xoVar.f52063r);
                frameLayout.addView(xoVar.f52063r);
                frameLayout.setLayoutParams(new u4.p0(-1, -2));
                return new u4.d1(frameLayout);
            }
            return new u4.d1(new org.telegram.ui.Cells.n4(context, 23));
        }
        return new u4.d1(new org.telegram.ui.Cells.y8(context));
    }
}
