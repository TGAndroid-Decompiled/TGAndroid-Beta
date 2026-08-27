package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class sw implements org.telegram.ui.Components.ag {

    public final gy f42700a;

    public sw(gy gyVar) {
        this.f42700a = gyVar;
    }

    @Override
    public final hn P() {
        return null;
    }

    @Override
    public final int P0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public final boolean X0(long j10) {
        return false;
    }

    @Override
    public final boolean b1() {
        return false;
    }

    @Override
    public final void c1(CharSequence charSequence, boolean z10, boolean z11) {
        gy gyVar = this.f42700a;
        AndroidUtilities.runOnUIThread(new xv(gyVar, 12), 100L);
        org.telegram.ui.Components.xp0 xp0Var = gyVar.C2;
        if (xp0Var != null) {
            if (z10) {
                if (xp0Var.h) {
                    xp0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.r61 r61Var = gyVar.D2;
                if (r61Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(r61Var);
                }
                org.telegram.ui.Components.r61 r61Var2 = new org.telegram.ui.Components.r61(16, this, charSequence);
                gyVar.D2 = r61Var2;
                AndroidUtilities.runOnUIThread(r61Var2, 1000L);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean g1() {
        return false;
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final TLRPC.Peer l() {
        return null;
    }

    @Override
    public final boolean n0() {
        return true;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        gy gyVar = this.f42700a;
        if (gyVar.f38621y2 == null || gyVar.E2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < gyVar.E2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) gyVar.E2.get(i12)).longValue(), 0L));
        }
        gy gyVar2 = this.f42700a;
        gyVar2.f38621y2.w(gyVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override
    public final void F() {
    }

    @Override
    public final void G(boolean z10) {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void N0(int i10) {
    }

    @Override
    public final void N1() {
    }

    @Override
    public final void S1(int i10) {
    }

    @Override
    public final void U1() {
    }

    @Override
    public final void W1(boolean z10) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void f1() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void l2() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void n(float f10) {
    }

    @Override
    public final void n1(CharSequence charSequence) {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void r(boolean z10) {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void A(float f10, int i10) {
    }

    @Override
    public final void o0(int i10, int i11) {
    }

    @Override
    public final void l1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
