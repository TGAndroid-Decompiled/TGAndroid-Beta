package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class vk extends org.telegram.ui.Components.un0 {
    public final wn I;

    public vk(wn wnVar, Context context, wn wnVar2, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j3, context, wnVar2, d6Var);
        this.I = wnVar;
    }

    @Override
    public final void b(boolean z10) {
        wn wnVar = this.I;
        wnVar.t7();
        wnVar.r7();
        al alVar = wnVar.f39418ab;
        if (alVar != null) {
            alVar.setTranslationY(wnVar.f39691w9 + getCurrentHeight());
        }
        if (z10) {
            wnVar.D9 = true;
            wnVar.jc();
        }
    }

    @Override
    public final boolean f(zg.o0 o0Var) {
        boolean z10;
        int i10;
        boolean z11;
        wn wnVar = this.I;
        wnVar.f39607q3 = o0Var;
        if (o0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        wnVar.f39620r3 = z10;
        if (o0Var == null) {
            wnVar.getMediaDataController().clearFoundMessageObjects();
            wnVar.kb(false);
            wnVar.Fc(0, 0, -1);
        }
        wnVar.Ic();
        wnVar.vc();
        wnVar.f39647t3 = wnVar.f39520j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = wnVar.getMediaDataController();
        String str = wnVar.f39647t3;
        long j3 = wnVar.T5;
        long j10 = wnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
        long j11 = wnVar.f39451d4;
        TLRPC.User user = wnVar.f39583o3;
        TLRPC.Chat chat = wnVar.f39595p3;
        if (TextUtils.isEmpty(wnVar.f39647t3) && wnVar.f39607q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, j11, false, user, chat, z11, wnVar.f39607q3);
        AndroidUtilities.hideKeyboard(wnVar.f39520j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        wn wnVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = wnVar.f39520j0;
        if (u0Var != null && u0Var.s() && a() && wnVar.f39659u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
