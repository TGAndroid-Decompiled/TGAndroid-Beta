package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class vk extends org.telegram.ui.Components.pn0 {
    public final xn F;

    public vk(xn xnVar, Context context, xn xnVar2, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, j10, context, xnVar2, g6Var);
        this.F = xnVar;
    }

    @Override
    public final void b(boolean z4) {
        xn xnVar = this.F;
        xnVar.t7();
        xnVar.r7();
        al alVar = xnVar.Ya;
        if (alVar != null) {
            alVar.setTranslationY(xnVar.t9 + getCurrentHeight());
        }
        if (z4) {
            xnVar.A9 = true;
            xnVar.jc();
        }
    }

    @Override
    public final boolean f(ng.q0 q0Var) {
        boolean z4;
        int i10;
        boolean z10;
        xn xnVar = this.F;
        xnVar.f43280n3 = q0Var;
        if (q0Var != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        xnVar.f43292o3 = z4;
        if (q0Var == null) {
            xnVar.getMediaDataController().clearFoundMessageObjects();
            xnVar.kb(false);
            xnVar.Fc(0, 0, -1);
        }
        xnVar.Ic();
        xnVar.vc();
        xnVar.f43317q3 = xnVar.f43191g0.getSearchField().getText().toString();
        MediaDataController mediaDataController = xnVar.getMediaDataController();
        String str = xnVar.f43317q3;
        long j10 = xnVar.Q5;
        long j11 = xnVar.I6;
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        long j12 = xnVar.f43116a4;
        TLRPC.User user = xnVar.f43255l3;
        TLRPC.Chat chat = xnVar.f43267m3;
        if (TextUtils.isEmpty(xnVar.f43317q3) && xnVar.f43280n3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, j12, false, user, chat, z10, xnVar.f43280n3);
        AndroidUtilities.hideKeyboard(xnVar.f43191g0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z4) {
        boolean z10;
        super.h(z4);
        xn xnVar = this.F;
        org.telegram.ui.ActionBar.w0 w0Var = xnVar.f43191g0;
        if (w0Var != null && w0Var.s() && a() && xnVar.f43330r3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
    }
}
