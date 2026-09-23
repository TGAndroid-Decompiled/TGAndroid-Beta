package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class vk extends org.telegram.ui.Components.in0 {
    public final xn I;

    public vk(xn xnVar, Context context, xn xnVar2, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j3, context, xnVar2, d6Var);
        this.I = xnVar;
    }

    @Override
    public final void b(boolean z10) {
        xn xnVar = this.I;
        xnVar.t7();
        xnVar.r7();
        al alVar = xnVar.f39319ab;
        if (alVar != null) {
            alVar.setTranslationY(xnVar.f39592w9 + getCurrentHeight());
        }
        if (z10) {
            xnVar.D9 = true;
            xnVar.jc();
        }
    }

    @Override
    public final boolean f(zg.p0 p0Var) {
        boolean z10;
        int i10;
        boolean z11;
        xn xnVar = this.I;
        xnVar.f39508q3 = p0Var;
        if (p0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        xnVar.f39521r3 = z10;
        if (p0Var == null) {
            xnVar.getMediaDataController().clearFoundMessageObjects();
            xnVar.kb(false);
            xnVar.Fc(0, 0, -1);
        }
        xnVar.Ic();
        xnVar.vc();
        xnVar.f39548t3 = xnVar.f39421j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = xnVar.getMediaDataController();
        String str = xnVar.f39548t3;
        long j3 = xnVar.T5;
        long j10 = xnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
        long j11 = xnVar.f39352d4;
        TLRPC.User user = xnVar.f39484o3;
        TLRPC.Chat chat = xnVar.f39496p3;
        if (TextUtils.isEmpty(xnVar.f39548t3) && xnVar.f39508q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, j11, false, user, chat, z11, xnVar.f39508q3);
        AndroidUtilities.hideKeyboard(xnVar.f39421j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        xn xnVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = xnVar.f39421j0;
        if (v0Var != null && v0Var.s() && a() && xnVar.f39560u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
