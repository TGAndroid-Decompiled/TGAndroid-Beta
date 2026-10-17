package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class sk extends org.telegram.ui.Components.fo0 {
    public final sn I;

    public sk(sn snVar, Context context, sn snVar2, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j10, context, snVar2, d6Var);
        this.I = snVar;
    }

    @Override
    public final void b(boolean z10) {
        sn snVar = this.I;
        snVar.w7();
        snVar.u7();
        xk xkVar = snVar.f41168bb;
        if (xkVar != null) {
            xkVar.setTranslationY(snVar.w9 + getCurrentHeight());
        }
        if (z10) {
            snVar.D9 = true;
            snVar.nc();
        }
    }

    @Override
    public final boolean f(ah.i1 i1Var) {
        boolean z10;
        int i10;
        boolean z11;
        sn snVar = this.I;
        snVar.f41344q3 = i1Var;
        if (i1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        snVar.f41357r3 = z10;
        if (i1Var == null) {
            snVar.getMediaDataController().clearFoundMessageObjects();
            snVar.ob(false);
            snVar.Jc(0, 0, -1);
        }
        snVar.Mc();
        snVar.zc();
        snVar.f41384t3 = snVar.f41256j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = snVar.getMediaDataController();
        String str = snVar.f41384t3;
        long j10 = snVar.T5;
        long j11 = snVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
        long j12 = snVar.f41188d4;
        TLRPC.User user = snVar.f41322o3;
        TLRPC.Chat chat = snVar.f41333p3;
        if (TextUtils.isEmpty(snVar.f41384t3) && snVar.f41344q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, j12, false, user, chat, z11, snVar.f41344q3);
        AndroidUtilities.hideKeyboard(snVar.f41256j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        sn snVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = snVar.f41256j0;
        if (u0Var != null && u0Var.s() && a() && snVar.f41397u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
