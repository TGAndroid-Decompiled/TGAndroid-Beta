package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class zk extends org.telegram.ui.Components.oo0 {
    public final zn I;

    public zk(zn znVar, Context context, zn znVar2, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, j3, context, znVar2, e6Var);
        this.I = znVar;
    }

    @Override
    public final void b(boolean z10) {
        zn znVar = this.I;
        znVar.w7();
        znVar.u7();
        el elVar = znVar.f44769bb;
        if (elVar != null) {
            elVar.setTranslationY(znVar.f45029w9 + getCurrentHeight());
        }
        if (z10) {
            znVar.D9 = true;
            znVar.nc();
        }
    }

    @Override
    public final boolean f(zg.n0 n0Var) {
        boolean z10;
        int i10;
        boolean z11;
        zn znVar = this.I;
        znVar.f44945q3 = n0Var;
        if (n0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        znVar.f44958r3 = z10;
        if (n0Var == null) {
            znVar.getMediaDataController().clearFoundMessageObjects();
            znVar.ob(false);
            znVar.Jc(0, 0, -1);
        }
        znVar.Mc();
        znVar.zc();
        znVar.f44985t3 = znVar.f44858j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str = znVar.f44985t3;
        long j3 = znVar.T5;
        long j10 = znVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        long j11 = znVar.f44788d4;
        TLRPC.User user = znVar.f44921o3;
        TLRPC.Chat chat = znVar.f44933p3;
        if (TextUtils.isEmpty(znVar.f44985t3) && znVar.f44945q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, j11, false, user, chat, z11, znVar.f44945q3);
        AndroidUtilities.hideKeyboard(znVar.f44858j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        zn znVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = znVar.f44858j0;
        if (v0Var != null && v0Var.s() && a() && znVar.f44997u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
