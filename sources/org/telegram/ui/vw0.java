package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class vw0 implements org.telegram.ui.Components.pg {
    public final PopupNotificationActivity f40794a;

    public vw0(PopupNotificationActivity popupNotificationActivity) {
        this.f40794a = popupNotificationActivity;
    }

    @Override
    public final boolean C0() {
        return true;
    }

    @Override
    public final void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f40794a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.f32137a0.size()) {
            popupNotificationActivity.f32137a0.remove(popupNotificationActivity.S);
        }
        MessagesController.getInstance(popupNotificationActivity.Q.currentAccount).markDialogAsRead(popupNotificationActivity.Q.getDialogId(), popupNotificationActivity.Q.getId(), Math.max(0, popupNotificationActivity.Q.getId()), popupNotificationActivity.Q.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers K() {
        return null;
    }

    @Override
    public final int Z0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem b1() {
        return null;
    }

    @Override
    public final boolean c1(long j10) {
        return false;
    }

    @Override
    public final boolean f1() {
        return false;
    }

    @Override
    public final boolean k1() {
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final un p0() {
        return null;
    }

    @Override
    public final boolean s1() {
        return false;
    }

    @Override
    public final int v() {
        return 0;
    }

    @Override
    public final TLRPC.Peer y() {
        return null;
    }

    @Override
    public final void z1() {
        PopupNotificationActivity popupNotificationActivity = this.f40794a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override
    public final void A(float f7) {
    }

    @Override
    public final void D(boolean z10) {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void R0() {
    }

    @Override
    public final void W1() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y0(int i10) {
    }

    @Override
    public final void Y1(int i10) {
    }

    @Override
    public final void a0(boolean z10) {
    }

    @Override
    public final void b2() {
    }

    @Override
    public final void c2(boolean z10) {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void j1() {
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
    public final void n1() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void r1(CharSequence charSequence) {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void v1() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void E0(int i10, int i11) {
    }

    @Override
    public final void U(float f7, int i10) {
    }

    @Override
    public final void h1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void p1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void d2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
