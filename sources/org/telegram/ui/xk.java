package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class xk extends org.telegram.ui.Components.vn0 {
    public final zn I;

    public xk(zn znVar, Context context, zn znVar2, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, j3, context, znVar2, e6Var);
        this.I = znVar;
    }

    @Override
    public final void b(boolean z10) {
        zn znVar = this.I;
        znVar.t7();
        znVar.r7();
        bl blVar = znVar.f40210ab;
        if (blVar != null) {
            blVar.setTranslationY(znVar.f40484w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.jc();
        }
    }

    @Override
    public final boolean f(zg.o0 o0Var) {
        boolean z10;
        int i10;
        boolean z11;
        zn znVar = this.I;
        znVar.f40400q3 = o0Var;
        if (o0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        znVar.f40413r3 = z10;
        if (o0Var == null) {
            znVar.getMediaDataController().clearFoundMessageObjects();
            znVar.kb(false);
            znVar.Fc(0, 0, -1);
        }
        znVar.Ic();
        znVar.vc();
        znVar.f40440t3 = znVar.f40313j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str = znVar.f40440t3;
        long j3 = znVar.T5;
        long j10 = znVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        long j11 = znVar.f40243d4;
        TLRPC.User user = znVar.f40376o3;
        TLRPC.Chat chat = znVar.f40388p3;
        if (TextUtils.isEmpty(znVar.f40440t3) && znVar.f40400q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, j11, false, user, chat, z11, znVar.f40400q3);
        AndroidUtilities.hideKeyboard(znVar.f40313j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        zn znVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = znVar.f40313j0;
        if (v0Var != null && v0Var.s() && a() && znVar.f40452u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
