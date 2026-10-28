package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class uk extends org.telegram.ui.Components.po0 {
    public final wn I;

    public uk(wn wnVar, Context context, wn wnVar2, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, j10, context, wnVar2, u6Var);
        this.I = wnVar;
    }

    @Override
    public final void b(boolean z10) {
        wn wnVar = this.I;
        wnVar.C7();
        wnVar.A7();
        zk zkVar = wnVar.Ab;
        if (zkVar != null) {
            zkVar.setTranslationY(wnVar.M9 + getCurrentHeight());
        }
        if (z10) {
            wnVar.T9 = true;
            wnVar.Ac();
        }
    }

    @Override
    public final boolean f(bh.x0 x0Var) {
        boolean z10;
        int i10;
        boolean z11;
        wn wnVar = this.I;
        wnVar.C3 = x0Var;
        if (x0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        wnVar.D3 = z10;
        if (x0Var == null) {
            wnVar.getMediaDataController().clearFoundMessageObjects();
            wnVar.zb(false);
            wnVar.Wc(0, 0, -1);
        }
        wnVar.Zc();
        wnVar.Mc();
        wnVar.F3 = wnVar.f45162j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = wnVar.getMediaDataController();
        String str = wnVar.F3;
        long j10 = wnVar.f45168j6;
        long j11 = wnVar.f45065b7;
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
        long j12 = wnVar.f45241p4;
        TLRPC.User user = wnVar.A3;
        TLRPC.Chat chat = wnVar.B3;
        if (TextUtils.isEmpty(wnVar.F3) && wnVar.C3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, j12, false, user, chat, z11, wnVar.C3);
        AndroidUtilities.hideKeyboard(wnVar.f45162j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        wn wnVar = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = wnVar.f45162j0;
        if (w0Var != null && w0Var.v() && a() && wnVar.G3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
