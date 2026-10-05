package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zp extends s4.h0 {
    public final Context f43872c;
    public final aq d;

    public zp(aq aqVar, Context context) {
        this.d = aqVar;
        this.f43872c = context;
    }

    @Override
    public final int h() {
        int i10;
        aq aqVar = this.d;
        if (!aqVar.d.isEmpty()) {
            i10 = aqVar.f34936n.size() + 1;
        } else {
            i10 = 0;
        }
        return i10 + 2;
    }

    @Override
    public final int j(int i10) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.f46538a;
        int j3 = j(i10);
        aq aqVar = this.d;
        if (j3 != 0) {
            if (j3 != 1) {
                if (j3 == 2) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) aqVar.f34936n.get(i10 - 3);
                    boolean contains = aqVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.n2) aqVar).currentAccount;
                    ((org.telegram.ui.Cells.y) view).a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B6, false));
        int i12 = aqVar.f34938s;
        if (i12 == 1) {
            e9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            e9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            e9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f43872c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new s4.c1(new org.telegram.ui.Cells.y(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                aq aqVar = this.d;
                AndroidUtilities.removeFromParent(aqVar.f34937r);
                frameLayout.addView(aqVar.f34937r);
                frameLayout.setLayoutParams(new s4.p0(-1, -2));
                return new s4.c1(frameLayout);
            }
            return new s4.c1(new org.telegram.ui.Cells.m4(context, 23));
        }
        return new s4.c1(new org.telegram.ui.Cells.e9(context));
    }
}
