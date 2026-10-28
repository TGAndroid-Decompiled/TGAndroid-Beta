package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class re1 extends qg.b {
    public final cf1 d;

    public re1(cf1 cf1Var) {
        this.d = cf1Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        cf1 cf1Var = this.d;
        cf1Var.getClass();
        return cf1Var.f38291b;
    }

    @Override
    public final int h() {
        return F().size() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((te1) this.d.f38291b.get(i10)).f47075a;
    }

    @Override
    public final void l() {
        this.d.f38294c = h();
        super.l();
    }

    @Override
    public final void v(s4.e1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.re1.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        cf1 cf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                qe1 qe1Var = new qe1(this, cf1Var.getParentActivity());
                cf1Var.E0 = qe1Var;
                return new s4.e1(qe1Var);
            }
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(viewGroup.getContext(), null);
            c10Var.setViewType(24);
            c10Var.setIsSingleCell(true);
            c10Var.f27026w = true;
            return new s4.e1(c10Var);
        }
        ze1 ze1Var = new ze1(cf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -cf1Var.f38288a);
            ze1Var.setForumIcon(pg.d.d(pg.a.f46877k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            ze1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            ze1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.r2) cf1Var).inPreviewMode;
        ze1Var.f24681k0 = z10;
        ze1Var.setArchivedPullAnimation(cf1Var.f38331w);
        return new s4.e1(ze1Var);
    }
}
