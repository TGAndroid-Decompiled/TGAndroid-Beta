package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class u81 implements org.telegram.ui.Components.wn {
    public final TLRPC.TL_forumTopic f50017a;
    public final m91 f50018b;

    public u81(m91 m91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f50018b = m91Var;
        this.f50017a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f50018b.finishPreviewFragment();
    }

    @Override
    public final void q() {
        int i3;
        int i10;
        m91 m91Var = this.f50018b;
        m91Var.finishPreviewFragment();
        org.telegram.messenger.hp messagesController = m91Var.getMessagesController();
        long j10 = m91Var.f47575a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f50017a;
        boolean r22 = messagesController.r2(-j10, tL_forumTopic.f27053id, null);
        m91Var.getNotificationsController().G(-j10, tL_forumTopic.f27053id, !r22);
        if (org.telegram.ui.Components.fc.a(m91Var)) {
            if (!r22) {
                i3 = 3;
            } else {
                i3 = 4;
            }
            if (!r22) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            org.telegram.ui.Components.fc.z(m91Var, i3, i10, m91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void t() {
        this.f50018b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new qv0(24, this, this.f50017a), 500L);
    }

    @Override
    public final void v() {
        int i3;
        m91 m91Var = this.f50018b;
        i3 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).f22989d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = m91Var.f47575a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f50017a;
        sb2.append(org.telegram.messenger.us.v(-j10, tL_forumTopic.f27053id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.us.v(-j10, tL_forumTopic.f27053id, false), z11).apply();
        m91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.fc.a(m91Var)) {
            org.telegram.ui.Components.fc.S(z10 ? 1 : 0, m91Var, m91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void z(int i3) {
        m91 m91Var = this.f50018b;
        long j10 = m91Var.f47575a;
        m91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f50017a;
        if (i3 == 0) {
            if (m91Var.getMessagesController().r2(-j10, tL_forumTopic.f27053id, null)) {
                m91Var.getNotificationsController().G(-j10, tL_forumTopic.f27053id, false);
            }
            if (org.telegram.ui.Components.fc.a(m91Var)) {
                org.telegram.ui.Components.fc.z(m91Var, 4, i3, m91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        m91Var.getNotificationsController().H(-j10, i3, tL_forumTopic.f27053id);
        if (org.telegram.ui.Components.fc.a(m91Var)) {
            org.telegram.ui.Components.fc.z(m91Var, 5, i3, m91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
    }
}
