package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class xv0 implements org.telegram.ui.Components.mg {
    public final PopupNotificationActivity f43702a;

    public xv0(PopupNotificationActivity popupNotificationActivity) {
        this.f43702a = popupNotificationActivity;
    }

    @Override
    public final boolean B0() {
        return true;
    }

    @Override
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f43702a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.f33791a0.size()) {
            popupNotificationActivity.f33791a0.remove(popupNotificationActivity.S);
        }
        MessagesController.getInstance(popupNotificationActivity.Q.currentAccount).markDialogAsRead(popupNotificationActivity.Q.getDialogId(), popupNotificationActivity.Q.getId(), Math.max(0, popupNotificationActivity.Q.getId()), popupNotificationActivity.Q.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
        return null;
    }

    @Override
    public final int Y0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem a1() {
        return null;
    }

    @Override
    public final boolean b1(long j10) {
        return false;
    }

    @Override
    public final boolean e1() {
        return false;
    }

    @Override
    public final boolean j1() {
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final in p0() {
        return null;
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final int u() {
        return 0;
    }

    @Override
    public final TLRPC.Peer x() {
        return null;
    }

    @Override
    public final void y1() {
        PopupNotificationActivity popupNotificationActivity = this.f43702a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void V1(int i10) {
    }

    @Override
    public final void X0(int i10) {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void Y1() {
    }

    @Override
    public final void Z1(boolean z10) {
    }

    @Override
    public final void a0(boolean z10) {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void m0() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void q1(CharSequence charSequence) {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u1() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void z(float f7) {
    }

    @Override
    public final void D0(int i10, int i11) {
    }

    @Override
    public final void U(float f7, int i10) {
    }

    @Override
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
