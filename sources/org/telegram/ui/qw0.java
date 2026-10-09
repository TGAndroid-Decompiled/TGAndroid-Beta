package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class qw0 implements org.telegram.ui.Components.qg {
    public final PopupNotificationActivity f41217a;

    public qw0(PopupNotificationActivity popupNotificationActivity) {
        this.f41217a = popupNotificationActivity;
    }

    @Override
    public final boolean C1() {
        return false;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final void K(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.f41217a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.f34114a0.size()) {
            popupNotificationActivity.f34114a0.remove(popupNotificationActivity.S);
        }
        MessagesController.getInstance(popupNotificationActivity.Q.currentAccount).markDialogAsRead(popupNotificationActivity.Q.getDialogId(), popupNotificationActivity.Q.getId(), Math.max(0, popupNotificationActivity.Q.getId()), popupNotificationActivity.Q.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override
    public final void L1() {
        PopupNotificationActivity popupNotificationActivity = this.f41217a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers P() {
        return null;
    }

    @Override
    public final int h1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem j1() {
        return null;
    }

    @Override
    public final boolean l1(long j3) {
        return false;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final pn u0() {
        return null;
    }

    @Override
    public final boolean u1() {
        return false;
    }

    @Override
    public final int v() {
        return 0;
    }

    @Override
    public final TLRPC.Peer x() {
        return null;
    }

    @Override
    public final void B1(CharSequence charSequence) {
    }

    @Override
    public final void B2() {
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void F2() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void M0() {
    }

    @Override
    public final void O0() {
    }

    @Override
    public final void Z0() {
    }

    @Override
    public final void a0() {
    }

    @Override
    public final void c0(boolean z10) {
    }

    @Override
    public final void g1(int i10) {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void j2() {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void l2(int i10) {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void p2(boolean z10) {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void z(float f7) {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void K0(int i10, int i11) {
    }

    @Override
    public final void V(float f7, int i10) {
    }

    @Override
    public final void r1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
