package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class wj extends org.telegram.ui.Components.tl0 {
    public final wm J;

    public wj(wm wmVar, Context context, wm wmVar2, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, wmVar2, i3, j10, e6Var);
        this.J = wmVar;
    }

    @Override
    public final void b(boolean z10) {
        wm wmVar = this.J;
        wmVar.H7();
        wmVar.F7();
        dk dkVar = wmVar.f51558yb;
        if (dkVar != null) {
            dkVar.setTranslationY(wmVar.Q9 + getCurrentHeight());
        }
        if (z10) {
            wmVar.X9 = true;
            wmVar.Nc();
        }
    }

    @Override
    public final boolean f(dh.n0 n0Var) {
        boolean z10;
        int i3;
        boolean z11;
        wm wmVar = this.J;
        wmVar.F3 = n0Var;
        if (n0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        wmVar.G3 = z10;
        if (n0Var == null) {
            org.telegram.messenger.li mediaDataController = wmVar.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.f24010a1.clear();
            mediaDataController.f24013b1.clear();
            wmVar.Mb(false);
            wmVar.jd(0, 0, -1);
        }
        wmVar.md();
        wmVar.Zc();
        wmVar.I3 = wmVar.f51371k0.getSearchField().getText().toString();
        org.telegram.messenger.li mediaDataController2 = wmVar.getMediaDataController();
        String str = wmVar.I3;
        long j10 = wmVar.f51376k6;
        long j11 = wmVar.f51272c7;
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
        long j12 = wmVar.f51475s4;
        TLRPC.User user = wmVar.D3;
        TLRPC.Chat chat = wmVar.E3;
        if (TextUtils.isEmpty(wmVar.I3) && wmVar.F3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController2.X1(str, j10, j11, i3, 0, j12, false, user, chat, z11, wmVar.F3);
        org.telegram.messenger.g0.v1(wmVar.f51371k0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        wm wmVar = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = wmVar.f51371k0;
        if (q0Var != null && q0Var.v() && a() && wmVar.J3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
