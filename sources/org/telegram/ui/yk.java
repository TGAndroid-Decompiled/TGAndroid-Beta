package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class yk extends org.telegram.ui.Components.hn0 {
    public final co I;

    public yk(co coVar, Context context, co coVar2, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, coVar2, f6Var);
        this.I = coVar;
    }

    @Override
    public final void b(boolean z10) {
        co coVar = this.I;
        coVar.t7();
        coVar.r7();
        dl dlVar = coVar.f35209bb;
        if (dlVar != null) {
            dlVar.setTranslationY(coVar.f35469w9 + getCurrentHeight());
        }
        if (z10) {
            coVar.D9 = true;
            coVar.jc();
        }
    }

    @Override
    public final boolean f(ah.j1 j1Var) {
        boolean z10;
        int i10;
        boolean z11;
        co coVar = this.I;
        coVar.f35385q3 = j1Var;
        if (j1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        coVar.f35398r3 = z10;
        if (j1Var == null) {
            coVar.getMediaDataController().clearFoundMessageObjects();
            coVar.kb(false);
            coVar.Fc(0, 0, -1);
        }
        coVar.Ic();
        coVar.vc();
        coVar.f35425t3 = coVar.f35298j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = coVar.getMediaDataController();
        String str = coVar.f35425t3;
        long j3 = coVar.T5;
        long j10 = coVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
        long j11 = coVar.f35228d4;
        TLRPC.User user = coVar.f35361o3;
        TLRPC.Chat chat = coVar.f35373p3;
        if (TextUtils.isEmpty(coVar.f35425t3) && coVar.f35385q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, j11, false, user, chat, z11, coVar.f35385q3);
        AndroidUtilities.hideKeyboard(coVar.f35298j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        co coVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = coVar.f35298j0;
        if (v0Var != null && v0Var.s() && a() && coVar.f35437u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
