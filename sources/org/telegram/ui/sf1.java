package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class sf1 extends og.b {
    public final dg1 d;

    public sf1(dg1 dg1Var) {
        this.d = dg1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42678f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        dg1 dg1Var = this.d;
        dg1Var.getClass();
        return dg1Var.f33015b;
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
        return ((uf1) this.d.f33015b.get(i10)).f15533a;
    }

    @Override
    public final void l() {
        this.d.f33018c = h();
        super.l();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sf1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        dg1 dg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                rf1 rf1Var = new rf1(this, dg1Var.getParentActivity());
                dg1Var.E0 = rf1Var;
                return new s4.c1(rf1Var);
            }
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(viewGroup.getContext(), null);
            t00Var.setViewType(24);
            t00Var.setIsSingleCell(true);
            t00Var.f28018w = true;
            return new s4.c1(t00Var);
        }
        ag1 ag1Var = new ag1(dg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -dg1Var.f33012a);
            ag1Var.setForumIcon(ng.d.d(ng.a.f15217k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            ag1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            ag1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) dg1Var).inPreviewMode;
        ag1Var.f20708k0 = z10;
        ag1Var.setArchivedPullAnimation(dg1Var.f33052w);
        return new s4.c1(ag1Var);
    }
}
