package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ur0 implements org.telegram.ui.Components.uf {
    public final PopupNotificationActivity f50178a;

    public ur0(PopupNotificationActivity popupNotificationActivity) {
        this.f50178a = popupNotificationActivity;
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.f50178a;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i11 = popupNotificationActivity.T;
        if (i11 >= 0 && i11 < popupNotificationActivity.f41622b0.size()) {
            popupNotificationActivity.f41622b0.remove(popupNotificationActivity.T);
        }
        org.telegram.messenger.hp.s1(popupNotificationActivity.R.I1).j3(org.telegram.messenger.zi.B0(popupNotificationActivity.R.f26868k), popupNotificationActivity.R.f1(), Math.max(0, popupNotificationActivity.R.f1()), popupNotificationActivity.R.f26868k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers M() {
        return null;
    }

    @Override
    public final int O0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem R0() {
        return null;
    }

    @Override
    public final boolean T0(long j10) {
        return false;
    }

    @Override
    public final boolean V0() {
        return false;
    }

    @Override
    public final boolean a1() {
        return false;
    }

    @Override
    public final mm i0() {
        return null;
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
    public final int o() {
        return 0;
    }

    @Override
    public final void s1() {
        PopupNotificationActivity popupNotificationActivity = this.f50178a;
        org.telegram.messenger.zi ziVar = popupNotificationActivity.R;
        if (ziVar != null) {
            org.telegram.messenger.hp.s1(ziVar.I1).C4(0, popupNotificationActivity.L, org.telegram.messenger.zi.B0(popupNotificationActivity.R.f26868k), 0L, null);
        }
    }

    @Override
    public final TLRPC.Peer t() {
        return null;
    }

    @Override
    public final boolean u0() {
        return true;
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void M0(int i3) {
    }

    @Override
    public final void T1(int i3) {
    }

    @Override
    public final void c0(boolean z10) {
    }

    @Override
    public final void c2(boolean z10) {
    }

    @Override
    public final void j1(CharSequence charSequence) {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void F() {
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void Z0() {
    }

    @Override
    public final void a0() {
    }

    @Override
    public final void b1() {
    }

    @Override
    public final void b2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void g1() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void O(float f10, int i3) {
    }

    @Override
    public final void Y0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public final void h1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
