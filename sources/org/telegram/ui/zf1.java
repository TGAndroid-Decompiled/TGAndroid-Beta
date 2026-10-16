package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class zf1 extends pg.b {
    public final kg1 d;

    public zf1(kg1 kg1Var) {
        this.d = kg1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        kg1 kg1Var = this.d;
        kg1Var.getClass();
        return kg1Var.f37383b;
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
        return ((bg1) this.d.f37383b.get(i10)).f42904a;
    }

    @Override
    public final void l() {
        this.d.f37386c = h();
        super.l();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zf1.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        kg1 kg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                yf1 yf1Var = new yf1(this, kg1Var.getParentActivity());
                kg1Var.E0 = yf1Var;
                return new s4.b1(yf1Var);
            }
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(viewGroup.getContext(), null);
            f10Var.setViewType(24);
            f10Var.setIsSingleCell(true);
            f10Var.f24549w = true;
            return new s4.b1(f10Var);
        }
        hg1 hg1Var = new hg1(kg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -kg1Var.f37380a);
            hg1Var.setForumIcon(og.d.d(og.a.f16332k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            hg1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            hg1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.m2) kg1Var).inPreviewMode;
        hg1Var.f21550k0 = z10;
        hg1Var.setArchivedPullAnimation(kg1Var.f37420w);
        return new s4.b1(hg1Var);
    }
}
