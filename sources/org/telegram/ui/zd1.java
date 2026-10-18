package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class zd1 implements org.telegram.ui.Components.yo {
    public final TLRPC.TL_forumTopic f43750a;
    public final te1 f43751b;

    public zd1(te1 te1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f43751b = te1Var;
        this.f43750a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f43751b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        te1 te1Var = this.f43751b;
        te1Var.finishPreviewFragment();
        MessagesController messagesController = te1Var.getMessagesController();
        long j10 = te1Var.f41705a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f43750a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.f20331id);
        te1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20331id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(te1Var)) {
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
            org.telegram.ui.Components.xc.z(te1Var, i10, i11, te1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
        this.f43751b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new m71(12, this, this.f43750a), 500L);
    }

    @Override
    public final void t() {
        int i10;
        te1 te1Var = this.f43751b;
        i10 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = te1Var.f41705a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f43750a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.f20331id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.f20331id, new StringBuilder("sound_enabled_")), z11).apply();
        te1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(te1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, te1Var, te1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void y(int i10) {
        te1 te1Var = this.f43751b;
        long j10 = te1Var.f41705a;
        te1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f43750a;
        if (i10 == 0) {
            if (te1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.f20331id)) {
                te1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.f20331id, false);
            }
            if (org.telegram.ui.Components.xc.a(te1Var)) {
                org.telegram.ui.Components.xc.z(te1Var, 4, i10, te1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        te1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.f20331id, i10);
        if (org.telegram.ui.Components.xc.a(te1Var)) {
            org.telegram.ui.Components.xc.z(te1Var, 5, i10, te1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
