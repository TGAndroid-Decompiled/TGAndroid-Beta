package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xe1 implements org.telegram.ui.Components.mo {
    public final TLRPC.TL_forumTopic f43023a;
    public final sf1 f43024b;

    public xe1(sf1 sf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f43024b = sf1Var;
        this.f43023a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f43024b.finishPreviewFragment();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        sf1 sf1Var = this.f43024b;
        sf1Var.finishPreviewFragment();
        MessagesController messagesController = sf1Var.getMessagesController();
        long j10 = sf1Var.f41188a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f43023a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f20897id);
        sf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20897id, !isDialogMuted);
        if (org.telegram.ui.Components.qc.a(sf1Var)) {
            if (!isDialogMuted) {
                i10 = 3;
            } else {
                i10 = 4;
            }
            if (!isDialogMuted) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            org.telegram.ui.Components.qc.z(sf1Var, i10, i11, sf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f43024b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new h21(22, this, this.f43023a), 500L);
    }

    @Override
    public final void u() {
        int i10;
        sf1 sf1Var = this.f43024b;
        i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j10 = sf1Var.f41188a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f43023a;
        boolean z4 = notificationsSettings.getBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.f20897id, sb), true);
        boolean z10 = !z4 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.f20897id, new StringBuilder("sound_enabled_")), z10).apply();
        sf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.qc.a(sf1Var)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, sf1Var, sf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void v(int i10) {
        sf1 sf1Var = this.f43024b;
        long j10 = sf1Var.f41188a;
        sf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f43023a;
        if (i10 == 0) {
            if (sf1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f20897id)) {
                sf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20897id, false);
            }
            if (org.telegram.ui.Components.qc.a(sf1Var)) {
                org.telegram.ui.Components.qc.z(sf1Var, 4, i10, sf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        sf1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f20897id, i10);
        if (org.telegram.ui.Components.qc.a(sf1Var)) {
            org.telegram.ui.Components.qc.z(sf1Var, 5, i10, sf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void j() {
    }
}
