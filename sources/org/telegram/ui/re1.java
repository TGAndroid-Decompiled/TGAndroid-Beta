package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class re1 implements org.telegram.ui.Components.mo {
    public final TLRPC.TL_forumTopic f40946a;
    public final mf1 f40947b;

    public re1(mf1 mf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f40947b = mf1Var;
        this.f40946a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f40947b.finishPreviewFragment();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        mf1 mf1Var = this.f40947b;
        mf1Var.finishPreviewFragment();
        MessagesController messagesController = mf1Var.getMessagesController();
        long j10 = mf1Var.f39102a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f40946a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f20895id);
        mf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20895id, !isDialogMuted);
        if (org.telegram.ui.Components.qc.a(mf1Var)) {
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
            org.telegram.ui.Components.qc.z(mf1Var, i10, i11, mf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f40947b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new w01(23, this, this.f40946a), 500L);
    }

    @Override
    public final void u() {
        int i10;
        mf1 mf1Var = this.f40947b;
        i10 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j10 = mf1Var.f39102a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f40946a;
        boolean z4 = notificationsSettings.getBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.f20895id, sb), true);
        boolean z10 = !z4 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.f20895id, new StringBuilder("sound_enabled_")), z10).apply();
        mf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.qc.a(mf1Var)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, mf1Var, mf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void v(int i10) {
        mf1 mf1Var = this.f40947b;
        long j10 = mf1Var.f39102a;
        mf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f40946a;
        if (i10 == 0) {
            if (mf1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f20895id)) {
                mf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20895id, false);
            }
            if (org.telegram.ui.Components.qc.a(mf1Var)) {
                org.telegram.ui.Components.qc.z(mf1Var, 4, i10, mf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        mf1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f20895id, i10);
        if (org.telegram.ui.Components.qc.a(mf1Var)) {
            org.telegram.ui.Components.qc.z(mf1Var, 5, i10, mf1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void j() {
    }
}
