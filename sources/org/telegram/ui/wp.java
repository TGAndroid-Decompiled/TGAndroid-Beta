package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class wp extends s4.g0 {
    public final Context f43346c;
    public final xp d;

    public wp(xp xpVar, Context context) {
        this.d = xpVar;
        this.f43346c = context;
    }

    @Override
    public final int b() {
        int i10;
        xp xpVar = this.d;
        if (!xpVar.d.isEmpty()) {
            i10 = xpVar.f43618n.size() + 1;
        } else {
            i10 = 0;
        }
        return i10 + 2;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 3;
        }
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.f47898a;
        int d = d(i10);
        xp xpVar = this.d;
        if (d != 0) {
            if (d != 1) {
                if (d == 2) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) xpVar.f43618n.get(i10 - 3);
                    boolean contains = xpVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.k2) xpVar).currentAccount;
                    ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0(2131747838, null));
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        org.telegram.ui.ActionBar.a7.V(b9Var.getTextView(), org.telegram.ui.ActionBar.t6.B6, null);
        int i12 = xpVar.f43620s;
        if (i12 == 1) {
            b9Var.setText(org.telegram.messenger.cd.L0(2131751148, null));
        } else if (i12 == 0) {
            b9Var.setText(org.telegram.messenger.cd.L0(2131751160, null));
        } else if (i12 == 2) {
            b9Var.setText(org.telegram.messenger.cd.L0(2131751430, null));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.f43346c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new s4.c1(new org.telegram.ui.Cells.x(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                xp xpVar = this.d;
                org.telegram.messenger.i0.E2(xpVar.f43619r);
                frameLayout.addView(xpVar.f43619r);
                frameLayout.setLayoutParams(new s4.o0(-1, -2));
                return new s4.c1(frameLayout);
            }
            return new s4.c1(new org.telegram.ui.Cells.p4(context, 23));
        }
        return new s4.c1(new org.telegram.ui.Cells.b9(context));
    }
}
