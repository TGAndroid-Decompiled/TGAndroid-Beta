package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wp extends s4.h0 {
    public final Context f45380c;
    public final xp d;

    public wp(xp xpVar, Context context) {
        this.d = xpVar;
        this.f45380c = context;
    }

    @Override
    public final int h() {
        int i10;
        xp xpVar = this.d;
        if (!xpVar.d.isEmpty()) {
            i10 = xpVar.f45749n.size() + 1;
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        View view = e1Var.f47773a;
        int j10 = j(i10);
        xp xpVar = this.d;
        if (j10 != 0) {
            if (j10 != 1) {
                if (j10 == 2) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) xpVar.f45749n.get(i10 - 3);
                    boolean contains = xpVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.r2) xpVar).currentAccount;
                    ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            return;
        }
        org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
        org.telegram.ui.ActionBar.f7.V(i9Var.getTextView(), org.telegram.ui.ActionBar.y6.B6, null);
        int i12 = xpVar.f45751s;
        if (i12 == 1) {
            i9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            i9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            i9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f45380c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new s4.e1(new org.telegram.ui.Cells.x(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                xp xpVar = this.d;
                AndroidUtilities.removeFromParent(xpVar.f45750r);
                frameLayout.addView(xpVar.f45750r);
                frameLayout.setLayoutParams(new s4.q0(-1, -2));
                return new s4.e1(frameLayout);
            }
            return new s4.e1(new org.telegram.ui.Cells.q4(context, 23));
        }
        return new s4.e1(new org.telegram.ui.Cells.i9(context));
    }
}
