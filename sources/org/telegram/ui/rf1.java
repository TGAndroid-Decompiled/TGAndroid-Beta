package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class rf1 implements org.telegram.ui.Components.bp {
    public final TLRPC.TL_forumTopic f39789a;
    public final lg1 f39790b;

    public rf1(lg1 lg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f39790b = lg1Var;
        this.f39789a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f39790b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        lg1 lg1Var = this.f39790b;
        lg1Var.finishPreviewFragment();
        MessagesController messagesController = lg1Var.getMessagesController();
        long j10 = lg1Var.f37957a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39789a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f19268id);
        lg1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f19268id, !isDialogMuted);
        if (org.telegram.ui.Components.zc.a(lg1Var)) {
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
            org.telegram.ui.Components.zc.z(lg1Var, i10, i11, lg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
        this.f39790b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new je1(1, this, this.f39789a), 500L);
    }

    @Override
    public final void s() {
        int i10;
        lg1 lg1Var = this.f39790b;
        i10 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = lg1Var.f37957a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39789a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.j(-j10, tL_forumTopic.f19268id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.j(-j10, tL_forumTopic.f19268id, new StringBuilder("sound_enabled_")), z11).apply();
        lg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.zc.a(lg1Var)) {
            org.telegram.ui.Components.zc.S(z10 ? 1 : 0, lg1Var, lg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void y(int i10) {
        lg1 lg1Var = this.f39790b;
        long j10 = lg1Var.f37957a;
        lg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f39789a;
        if (i10 == 0) {
            if (lg1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f19268id)) {
                lg1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f19268id, false);
            }
            if (org.telegram.ui.Components.zc.a(lg1Var)) {
                org.telegram.ui.Components.zc.z(lg1Var, 4, i10, lg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        lg1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f19268id, i10);
        if (org.telegram.ui.Components.zc.a(lg1Var)) {
            org.telegram.ui.Components.zc.z(lg1Var, 5, i10, lg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
