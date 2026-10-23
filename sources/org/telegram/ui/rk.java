package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class rk extends org.telegram.ui.Components.jo0 {
    public final sn I;

    public rk(sn snVar, Context context, sn snVar2, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, j10, context, snVar2, g6Var);
        this.I = snVar;
    }

    @Override
    public final void b(boolean z10) {
        sn snVar = this.I;
        snVar.w7();
        snVar.u7();
        wk wkVar = snVar.f41621nb;
        if (wkVar != null) {
            wkVar.setTranslationY(snVar.I9 + getCurrentHeight());
        }
        if (z10) {
            snVar.P9 = true;
            snVar.qc();
        }
    }

    @Override
    public final boolean f(ah.i1 i1Var) {
        boolean z10;
        int i10;
        boolean z11;
        sn snVar = this.I;
        snVar.C3 = i1Var;
        if (i1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        snVar.D3 = z10;
        if (i1Var == null) {
            snVar.getMediaDataController().clearFoundMessageObjects();
            snVar.qb(false);
            snVar.Mc(0, 0, -1);
        }
        snVar.Pc();
        snVar.Cc();
        snVar.F3 = snVar.f41560j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = snVar.getMediaDataController();
        String str = snVar.F3;
        long j10 = snVar.f41519f6;
        long j11 = snVar.X6;
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
        long j12 = snVar.f41638p4;
        TLRPC.User user = snVar.A3;
        TLRPC.Chat chat = snVar.B3;
        if (TextUtils.isEmpty(snVar.F3) && snVar.C3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, j12, false, user, chat, z11, snVar.C3);
        AndroidUtilities.hideKeyboard(snVar.f41560j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        sn snVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = snVar.f41560j0;
        if (u0Var != null && u0Var.s() && a() && snVar.G3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
