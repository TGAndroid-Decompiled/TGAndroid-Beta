package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class ua1 implements org.telegram.ui.Components.fo {
    public final TLRPC.TL_forumTopic f41899a;
    public final nb1 f41900b;

    public ua1(nb1 nb1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f41900b = nb1Var;
        this.f41899a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f41900b.finishPreviewFragment();
    }

    @Override
    public final void s() {
        int i10;
        int i11;
        nb1 nb1Var = this.f41900b;
        nb1Var.finishPreviewFragment();
        org.telegram.messenger.wp messagesController = nb1Var.getMessagesController();
        long j10 = nb1Var.f39797a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f41899a;
        boolean q22 = messagesController.q2(-j10, tL_forumTopic.f19846id, null);
        nb1Var.getNotificationsController().G(-j10, tL_forumTopic.f19846id, !q22);
        if (org.telegram.ui.Components.cc.a(nb1Var)) {
            if (!q22) {
                i10 = 3;
            } else {
                i10 = 4;
            }
            if (!q22) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            org.telegram.ui.Components.cc.z(nb1Var, i10, i11, nb1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void v() {
        this.f41900b.finishPreviewFragment();
        org.telegram.messenger.i0.h3(new y01(13, this, this.f41899a), 500L);
    }

    @Override
    public final void x() {
        int i10;
        nb1 nb1Var = this.f41900b;
        i10 = ((org.telegram.ui.ActionBar.k2) nb1Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i10).e7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = nb1Var.f39797a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f41899a;
        sb2.append(org.telegram.messenger.pt.v(-j10, tL_forumTopic.f19846id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.pt.v(-j10, tL_forumTopic.f19846id, false), z11).apply();
        nb1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.cc.a(nb1Var)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, nb1Var, nb1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void y(int i10) {
        nb1 nb1Var = this.f41900b;
        long j10 = nb1Var.f39797a;
        nb1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f41899a;
        if (i10 == 0) {
            if (nb1Var.getMessagesController().q2(-j10, tL_forumTopic.f19846id, null)) {
                nb1Var.getNotificationsController().G(-j10, tL_forumTopic.f19846id, false);
            }
            if (org.telegram.ui.Components.cc.a(nb1Var)) {
                org.telegram.ui.Components.cc.z(nb1Var, 4, i10, nb1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        nb1Var.getNotificationsController().H(-j10, i10, tL_forumTopic.f19846id);
        if (org.telegram.ui.Components.cc.a(nb1Var)) {
            org.telegram.ui.Components.cc.z(nb1Var, 5, i10, nb1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void n() {
    }
}
