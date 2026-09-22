package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class qw0 implements org.telegram.ui.Components.ng {
    public final PopupNotificationActivity f37001a;

    public qw0(PopupNotificationActivity popupNotificationActivity) {
        this.f37001a = popupNotificationActivity;
    }

    @Override
    public final boolean D0() {
        return true;
    }

    @Override
    public final void F1() {
        PopupNotificationActivity popupNotificationActivity = this.f37001a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.f37001a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.f31450a0.size()) {
            popupNotificationActivity.f31450a0.remove(popupNotificationActivity.S);
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
    public final int c1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem e1() {
        return null;
    }

    @Override
    public final boolean g1(long j3) {
        return false;
    }

    @Override
    public final boolean j1() {
        return false;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean p1() {
        return false;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final pn q0() {
        return null;
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final boolean x1() {
        return false;
    }

    @Override
    public final void A1() {
    }

    @Override
    public final void A2() {
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void U0() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void X(boolean z10) {
    }

    @Override
    public final void b1(int i10) {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void f2(int i10) {
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void j2(boolean z10) {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void n0() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void w1(CharSequence charSequence) {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void F0(int i10, int i11) {
    }

    @Override
    public final void K(float f7, int i10) {
    }

    @Override
    public final void m1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void u1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
