package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class vv0 implements org.telegram.ui.Components.eg {
    public final PopupNotificationActivity f39273a;

    public vv0(PopupNotificationActivity popupNotificationActivity) {
        this.f39273a = popupNotificationActivity;
    }

    @Override
    public final void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f39273a;
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
    public final TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override
    public final boolean G0() {
        return true;
    }

    @Override
    public final void H1() {
        PopupNotificationActivity popupNotificationActivity = this.f39273a;
        MessageObject messageObject = popupNotificationActivity.N;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.N.getDialogId(), 0L, 0, popupNotificationActivity.H);
        }
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
    public final boolean g1(long j10) {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean k1() {
        return false;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final TLRPC.Peer p() {
        return null;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final nn r0() {
        return null;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void C() {
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void E2() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void N0() {
    }

    @Override
    public final void V0() {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void b0(boolean z4) {
    }

    @Override
    public final void b1(int i10) {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void j2(int i10) {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void n2(boolean z4) {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void u1() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void y1(CharSequence charSequence) {
    }

    @Override
    public final void z(boolean z4) {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void H(float f10, int i10) {
    }

    @Override
    public final void I0(int i10, int i11) {
    }

    @Override
    public final void n1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override
    public final void v1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public final void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
