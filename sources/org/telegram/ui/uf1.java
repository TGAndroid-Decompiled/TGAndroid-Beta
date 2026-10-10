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
        int i10 = d1Var.f47706f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        fg1 fg1Var = this.d;
        fg1Var.getClass();
        return fg1Var.f37605b;
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
        return ((wf1) this.d.f37605b.get(i10)).f17129a;
    }

    @Override
    public final void l() {
        this.d.f37608c = h();
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
            org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(viewGroup.getContext(), null);
            k10Var.setViewType(24);
            k10Var.setIsSingleCell(true);
            k10Var.f27857w = true;
            return new s4.d1(k10Var);
        }
        cg1 cg1Var = new cg1(fg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -fg1Var.f37602a);
            cg1Var.setForumIcon(ng.d.d(ng.a.f16847k[0], ""));
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
        cg1Var.f22819k0 = z10;
        cg1Var.setArchivedPullAnimation(fg1Var.f37643w);
        return new s4.d1(cg1Var);
    }
}
