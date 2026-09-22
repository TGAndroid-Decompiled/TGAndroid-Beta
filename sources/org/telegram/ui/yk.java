package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class yk extends org.telegram.ui.Components.wn0 {
    public final zn I;

    public yk(zn znVar, Context context, zn znVar2, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, znVar2, f6Var);
        this.I = znVar;
    }

    @Override
    public final void b(boolean z10) {
        zn znVar = this.I;
        znVar.t7();
        znVar.r7();
        cl clVar = znVar.f40273ab;
        if (clVar != null) {
            clVar.setTranslationY(znVar.f40547w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.jc();
        }
    }

    @Override
    public final boolean f(zg.p0 p0Var) {
        boolean z10;
        int i10;
        boolean z11;
        zn znVar = this.I;
        znVar.f40463q3 = p0Var;
        if (p0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        znVar.f40476r3 = z10;
        if (p0Var == null) {
            znVar.getMediaDataController().clearFoundMessageObjects();
            znVar.kb(false);
            znVar.Fc(0, 0, -1);
        }
        znVar.Ic();
        znVar.vc();
        znVar.f40503t3 = znVar.f40376j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str = znVar.f40503t3;
        long j3 = znVar.T5;
        long j10 = znVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        long j11 = znVar.f40306d4;
        TLRPC.User user = znVar.f40439o3;
        TLRPC.Chat chat = znVar.f40451p3;
        if (TextUtils.isEmpty(znVar.f40503t3) && znVar.f40463q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, j11, false, user, chat, z11, znVar.f40463q3);
        AndroidUtilities.hideKeyboard(znVar.f40376j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        zn znVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = znVar.f40376j0;
        if (v0Var != null && v0Var.s() && a() && znVar.f40515u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
