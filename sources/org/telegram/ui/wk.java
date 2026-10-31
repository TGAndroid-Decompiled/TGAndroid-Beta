package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class wk extends org.telegram.ui.Components.rm0 {
    public final un I;

    public wk(un unVar, Context context, un unVar2, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, unVar2, i10, j10, p6Var);
        this.I = unVar;
    }

    @Override
    public final void b(boolean z10) {
        un unVar = this.I;
        unVar.B7();
        unVar.z7();
        dl dlVar = unVar.f42464wb;
        if (dlVar != null) {
            dlVar.setTranslationY(unVar.P9 + getCurrentHeight());
        }
        if (z10) {
            unVar.W9 = true;
            unVar.Dc();
        }
    }

    @Override
    public final boolean f(sg.o0 o0Var) {
        boolean z10;
        int i10;
        boolean z11;
        un unVar = this.I;
        unVar.E3 = o0Var;
        if (o0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        unVar.F3 = z10;
        if (o0Var == null) {
            org.telegram.messenger.ui mediaDataController = unVar.getMediaDataController();
            mediaDataController.Y0.clear();
            mediaDataController.Z0.clear();
            mediaDataController.f18306a1.clear();
            unVar.Cb(false);
            unVar.Zc(0, 0, -1);
        }
        unVar.cd();
        unVar.Pc();
        unVar.H3 = unVar.f42291j0.getSearchField().getText().toString();
        org.telegram.messenger.ui mediaDataController2 = unVar.getMediaDataController();
        String str = unVar.H3;
        long j10 = unVar.f42297j6;
        long j11 = unVar.f42199b7;
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
        long j12 = unVar.f42394r4;
        TLRPC.User user = unVar.C3;
        TLRPC.Chat chat = unVar.D3;
        if (TextUtils.isEmpty(unVar.H3) && unVar.E3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController2.X1(str, j10, j11, i10, 0, j12, false, user, chat, z11, unVar.E3);
        org.telegram.messenger.i0.v1(unVar.f42291j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        un unVar = this.I;
        org.telegram.ui.ActionBar.t0 t0Var = unVar.f42291j0;
        if (t0Var != null && t0Var.v() && a() && unVar.I3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
