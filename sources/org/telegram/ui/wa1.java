package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class wa1 implements org.telegram.ui.Components.fo {
    public final TLRPC.TL_forumTopic f42914a;
    public final pb1 f42915b;

    public wa1(pb1 pb1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f42915b = pb1Var;
        this.f42914a = tL_forumTopic;
    }

    @Override
    public final void E(int i10) {
        pb1 pb1Var = this.f42915b;
        long j10 = pb1Var.f40566a;
        pb1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f42914a;
        if (i10 == 0) {
            if (pb1Var.getMessagesController().q2(-j10, tL_forumTopic.f19845id, null)) {
                pb1Var.getNotificationsController().G(-j10, tL_forumTopic.f19845id, false);
            }
            if (org.telegram.ui.Components.cc.a(pb1Var)) {
                org.telegram.ui.Components.cc.z(pb1Var, 4, i10, pb1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        pb1Var.getNotificationsController().H(-j10, i10, tL_forumTopic.f19845id);
        if (org.telegram.ui.Components.cc.a(pb1Var)) {
            org.telegram.ui.Components.cc.z(pb1Var, 5, i10, pb1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f42915b.finishPreviewFragment();
    }

    @Override
    public final void v() {
        int i10;
        int i11;
        pb1 pb1Var = this.f42915b;
        pb1Var.finishPreviewFragment();
        org.telegram.messenger.vp messagesController = pb1Var.getMessagesController();
        long j10 = pb1Var.f40566a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f42914a;
        boolean q22 = messagesController.q2(-j10, tL_forumTopic.f19845id, null);
        pb1Var.getNotificationsController().G(-j10, tL_forumTopic.f19845id, !q22);
        if (org.telegram.ui.Components.cc.a(pb1Var)) {
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
            org.telegram.ui.Components.cc.z(pb1Var, i10, i11, pb1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void x() {
        this.f42915b.finishPreviewFragment();
        org.telegram.messenger.i0.h3(new t11(12, this, this.f42914a), 500L);
    }

    @Override
    public final void y() {
        int i10;
        pb1 pb1Var = this.f42915b;
        i10 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).e7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = pb1Var.f40566a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f42914a;
        sb2.append(org.telegram.messenger.ot.v(-j10, tL_forumTopic.f19845id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.ot.v(-j10, tL_forumTopic.f19845id, false), z11).apply();
        pb1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.cc.a(pb1Var)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, pb1Var, pb1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void n() {
    }
}
