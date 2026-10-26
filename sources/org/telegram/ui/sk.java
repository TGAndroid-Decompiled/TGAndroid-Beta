package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class sk extends org.telegram.ui.Components.oo0 {
    public final un I;

    public sk(un unVar, Context context, un unVar2, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, j10, context, unVar2, u6Var);
        this.I = unVar;
    }

    @Override
    public final void b(boolean z10) {
        un unVar = this.I;
        unVar.A7();
        unVar.y7();
        xk xkVar = unVar.f44468wb;
        if (xkVar != null) {
            xkVar.setTranslationY(unVar.I9 + getCurrentHeight());
        }
        if (z10) {
            unVar.P9 = true;
            unVar.wc();
        }
    }

    @Override
    public final boolean f(bh.x0 x0Var) {
        boolean z10;
        int i10;
        boolean z11;
        un unVar = this.I;
        unVar.C3 = x0Var;
        if (x0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        unVar.D3 = z10;
        if (x0Var == null) {
            unVar.getMediaDataController().clearFoundMessageObjects();
            unVar.vb(false);
            unVar.Sc(0, 0, -1);
        }
        unVar.Vc();
        unVar.Ic();
        unVar.F3 = unVar.f44294j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = unVar.getMediaDataController();
        String str = unVar.F3;
        long j10 = unVar.f44252f6;
        long j11 = unVar.X6;
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
        long j12 = unVar.f44373p4;
        TLRPC.User user = unVar.A3;
        TLRPC.Chat chat = unVar.B3;
        if (TextUtils.isEmpty(unVar.F3) && unVar.C3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, j12, false, user, chat, z11, unVar.C3);
        AndroidUtilities.hideKeyboard(unVar.f44294j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        un unVar = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = unVar.f44294j0;
        if (w0Var != null && w0Var.v() && a() && unVar.G3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
