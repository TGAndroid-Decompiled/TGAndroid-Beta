package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class rw implements org.telegram.ui.Components.hg {
    public final fy f42213a;

    public rw(fy fyVar) {
        this.f42213a = fyVar;
    }

    @Override
    public final boolean C0() {
        return true;
    }

    @Override
    public final void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        fy fyVar = this.f42213a;
        if (fyVar.f38379y2 != null && !fyVar.E2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < fyVar.E2.size(); i12++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) fyVar.E2.get(i12)).longValue(), 0L));
            }
            fy fyVar2 = this.f42213a;
            fyVar2.f38379y2.v(fyVar2, arrayList, charSequence, false, z10, i10, i11, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers G() {
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
    public final boolean f1(long j10) {
        return false;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        fy fyVar = this.f42213a;
        AndroidUtilities.runOnUIThread(new vv(fyVar, 12), 100L);
        org.telegram.ui.Components.iq0 iq0Var = fyVar.C2;
        if (iq0Var != null) {
            if (z10) {
                if (iq0Var.h) {
                    iq0Var.e(charSequence, true);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.o oVar = fyVar.D2;
            if (oVar != null) {
                AndroidUtilities.cancelRunOnUIThread(oVar);
            }
            org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(13, this, charSequence);
            fyVar.D2 = oVar2;
            AndroidUtilities.runOnUIThread(oVar2, 1000L);
        }
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final jn o0() {
        return null;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final TLRPC.Peer q() {
        return null;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final void B() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void M() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void U(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f2(int i10) {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void k0() {
    }

    @Override
    public final void k2(boolean z10) {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void v(float f9) {
    }

    @Override
    public final void v1(CharSequence charSequence) {
    }

    @Override
    public final void v2() {
    }

    @Override
    public final void x(boolean z10) {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void z2() {
    }

    @Override
    public final void E0(int i10, int i11) {
    }

    @Override
    public final void I(float f9, int i10) {
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
