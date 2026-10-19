package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xd1 implements org.telegram.ui.Components.yo {
    public final TLRPC.TL_forumTopic f43189a;
    public final re1 f43190b;

    public xd1(re1 re1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f43190b = re1Var;
        this.f43189a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f43190b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        re1 re1Var = this.f43190b;
        re1Var.finishPreviewFragment();
        MessagesController messagesController = re1Var.getMessagesController();
        long j10 = re1Var.f41142a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f43189a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f20325id);
        re1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20325id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(re1Var)) {
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
            org.telegram.ui.Components.xc.z(re1Var, i10, i11, re1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f43190b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new k71(12, this, this.f43189a), 500L);
    }

    @Override
    public final void t() {
        int i10;
        re1 re1Var = this.f43190b;
        i10 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = re1Var.f41142a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f43189a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.f20325id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.f20325id, new StringBuilder("sound_enabled_")), z11).apply();
        re1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(re1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, re1Var, re1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void x(int i10) {
        re1 re1Var = this.f43190b;
        long j10 = re1Var.f41142a;
        re1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f43189a;
        if (i10 == 0) {
            if (re1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f20325id)) {
                re1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20325id, false);
            }
            if (org.telegram.ui.Components.xc.a(re1Var)) {
                org.telegram.ui.Components.xc.z(re1Var, 4, i10, re1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        re1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f20325id, i10);
        if (org.telegram.ui.Components.xc.a(re1Var)) {
            org.telegram.ui.Components.xc.z(re1Var, 5, i10, re1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
