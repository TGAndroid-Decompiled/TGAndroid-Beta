package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class xf1 extends ng.b {
    public final ig1 d;

    public xf1(ig1 ig1Var) {
        this.d = ig1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        ig1 ig1Var = this.d;
        ig1Var.getClass();
        return ig1Var.f33684b;
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
        return ((zf1) this.d.f33684b.get(i10)).f14046a;
    }

    @Override
    public final void l() {
        this.d.f33687c = h();
        super.l();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xf1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        ig1 ig1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                wf1 wf1Var = new wf1(this, ig1Var.getParentActivity());
                ig1Var.E0 = wf1Var;
                return new s4.c1(wf1Var);
            }
            org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(viewGroup.getContext(), null);
            a10Var.setViewType(24);
            a10Var.setIsSingleCell(true);
            a10Var.f21345w = true;
            return new s4.c1(a10Var);
        }
        fg1 fg1Var = new fg1(ig1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -ig1Var.f33681a);
            fg1Var.setForumIcon(mg.d.d(mg.a.f13646k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            fg1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            fg1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.p2) ig1Var).inPreviewMode;
        fg1Var.f19802k0 = z10;
        fg1Var.setArchivedPullAnimation(ig1Var.f33721w);
        return new s4.c1(fg1Var);
    }
}
