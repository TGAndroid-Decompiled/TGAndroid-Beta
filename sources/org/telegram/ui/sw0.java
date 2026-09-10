package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sw0 implements org.telegram.ui.Components.qg {
    public final PopupNotificationActivity f36773a;

    public sw0(PopupNotificationActivity popupNotificationActivity) {
        this.f36773a = popupNotificationActivity;
    }

    @Override
    public final boolean D0() {
        return true;
    }

    @Override
    public final void D1() {
        PopupNotificationActivity popupNotificationActivity = this.f36773a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override
    public final void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.f36773a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.f30257a0.size()) {
            popupNotificationActivity.f30257a0.remove(popupNotificationActivity.S);
        }
        MessagesController.getInstance(popupNotificationActivity.Q.currentAccount).markDialogAsRead(popupNotificationActivity.Q.getDialogId(), popupNotificationActivity.Q.getId(), Math.max(0, popupNotificationActivity.Q.getId()), popupNotificationActivity.Q.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override
    public final int b1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final boolean h1() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final tn p0() {
        return null;
    }

    @Override
    public final int u() {
        return 0;
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final TLRPC.Peer w() {
        return null;
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void Z(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
    }

    @Override
    public final void b2() {
    }

    @Override
    public final void d2(int i10) {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h2(boolean z10) {
    }

    @Override
    public final void k() {
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
    public final void p1() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u1(CharSequence charSequence) {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void y2() {
    }

    @Override
    public final void F0(int i10, int i11) {
    }

    @Override
    public final void T(float f7, int i10) {
    }

    @Override
    public final void k1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
