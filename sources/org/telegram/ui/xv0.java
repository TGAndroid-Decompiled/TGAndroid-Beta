package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class xv0 implements org.telegram.ui.Components.eg {
    public final PopupNotificationActivity f43485a;

    public xv0(PopupNotificationActivity popupNotificationActivity) {
        this.f43485a = popupNotificationActivity;
    }

    @Override
    public final void C(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f43485a;
        if (popupNotificationActivity.N == null) {
            return;
        }
        int i12 = popupNotificationActivity.P;
        if (i12 >= 0 && i12 < popupNotificationActivity.X.size()) {
            popupNotificationActivity.X.remove(popupNotificationActivity.P);
        }
        MessagesController.getInstance(popupNotificationActivity.N.currentAccount).markDialogAsRead(popupNotificationActivity.N.getDialogId(), popupNotificationActivity.N.getId(), Math.max(0, popupNotificationActivity.N.getId()), popupNotificationActivity.N.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.N = null;
        popupNotificationActivity.f();
    }

    @Override
    public final boolean D1() {
        return false;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override
    public final boolean H0() {
        return true;
    }

    @Override
    public final void M1() {
        PopupNotificationActivity popupNotificationActivity = this.f43485a;
        MessageObject messageObject = popupNotificationActivity.N;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.N.getDialogId(), 0L, 0, popupNotificationActivity.H);
        }
    }

    @Override
    public final int f1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem h1() {
        return null;
    }

    @Override
    public final boolean j1(long j10) {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final TLRPC.Peer p() {
        return null;
    }

    @Override
    public final nn r0() {
        return null;
    }

    @Override
    public final boolean u1() {
        return false;
    }

    @Override
    public final void A(boolean z4) {
    }

    @Override
    public final void B() {
    }

    @Override
    public final void C1(CharSequence charSequence) {
    }

    @Override
    public final void F2() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void J2() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y(boolean z4) {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void e1(int i10) {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void p2(int i10) {
    }

    @Override
    public final void s2() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void t2(boolean z4) {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void x2() {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void G(float f10, int i10) {
    }

    @Override
    public final void J0(int i10, int i11) {
    }

    @Override
    public final void r1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public final void u2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
