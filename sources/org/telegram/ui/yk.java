package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class yk extends org.telegram.ui.Components.in0 {
    public final bo I;

    public yk(bo boVar, Context context, bo boVar2, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, j3, context, boVar2, e6Var);
        this.I = boVar;
    }

    @Override
    public final void b(boolean z10) {
        bo boVar = this.I;
        boVar.t7();
        boVar.r7();
        dl dlVar = boVar.f32260bb;
        if (dlVar != null) {
            dlVar.setTranslationY(boVar.f32520w9 + getCurrentHeight());
        }
        if (z10) {
            boVar.D9 = true;
            boVar.jc();
        }
    }

    @Override
    public final boolean f(zg.p0 p0Var) {
        boolean z10;
        int i10;
        boolean z11;
        bo boVar = this.I;
        boVar.f32436q3 = p0Var;
        if (p0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boVar.f32449r3 = z10;
        if (p0Var == null) {
            boVar.getMediaDataController().clearFoundMessageObjects();
            boVar.kb(false);
            boVar.Fc(0, 0, -1);
        }
        boVar.Ic();
        boVar.vc();
        boVar.f32476t3 = boVar.f32349j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = boVar.getMediaDataController();
        String str = boVar.f32476t3;
        long j3 = boVar.T5;
        long j10 = boVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
        long j11 = boVar.f32279d4;
        TLRPC.User user = boVar.f32412o3;
        TLRPC.Chat chat = boVar.f32424p3;
        if (TextUtils.isEmpty(boVar.f32476t3) && boVar.f32436q3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, j11, false, user, chat, z11, boVar.f32436q3);
        AndroidUtilities.hideKeyboard(boVar.f32349j0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        bo boVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = boVar.f32349j0;
        if (v0Var != null && v0Var.s() && a() && boVar.f32488u3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
