package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class uf1 extends og.b {
    public final fg1 d;

    public uf1(fg1 fg1Var) {
        this.d = fg1Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47660f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        fg1 fg1Var = this.d;
        fg1Var.getClass();
        return fg1Var.f37559b;
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
        return ((wf1) this.d.f37559b.get(i10)).f17125a;
    }

    @Override
    public final void l() {
        this.d.f37562c = h();
        super.l();
    }

    @Override
    public final void v(s4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uf1.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        fg1 fg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                tf1 tf1Var = new tf1(this, fg1Var.getParentActivity());
                fg1Var.E0 = tf1Var;
                return new s4.d1(tf1Var);
            }
            org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(viewGroup.getContext(), null);
            j10Var.setViewType(24);
            j10Var.setIsSingleCell(true);
            j10Var.f27555w = true;
            return new s4.d1(j10Var);
        }
        cg1 cg1Var = new cg1(fg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -fg1Var.f37556a);
            cg1Var.setForumIcon(ng.d.d(ng.a.f16843k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            cg1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            cg1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) fg1Var).inPreviewMode;
        cg1Var.f22815k0 = z10;
        cg1Var.setArchivedPullAnimation(fg1Var.f37597w);
        return new s4.d1(cg1Var);
    }
}
