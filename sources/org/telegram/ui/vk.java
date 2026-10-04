package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class vk extends org.telegram.ui.Components.ao0 {
    public final yn I;

    public vk(yn ynVar, Context context, yn ynVar2, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j3, context, ynVar2, d6Var);
        this.I = ynVar;
    }

    @Override
    public final void b(boolean z10) {
        yn ynVar = this.I;
        ynVar.t7();
        ynVar.r7();
        al alVar = ynVar.Ya;
        if (alVar != null) {
            alVar.setTranslationY(ynVar.f43529u9 + getCurrentHeight());
        }
        if (z10) {
            ynVar.B9 = true;
            ynVar.ic();
        }
    }

    @Override
    public final boolean f(zg.o0 o0Var) {
        boolean z10;
        int i10;
        boolean z11;
        yn ynVar = this.I;
        ynVar.f43447o3 = o0Var;
        if (o0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ynVar.f43459p3 = z10;
        if (o0Var == null) {
            ynVar.getMediaDataController().clearFoundMessageObjects();
            ynVar.jb(false);
            ynVar.Ec(0, 0, -1);
        }
        ynVar.Hc();
        ynVar.uc();
        ynVar.f43484r3 = ynVar.f43359h0.getSearchField().getText().toString();
        MediaDataController mediaDataController = ynVar.getMediaDataController();
        String str = ynVar.f43484r3;
        long j3 = ynVar.R5;
        long j10 = ynVar.J6;
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
        long j11 = ynVar.f43287b4;
        TLRPC.User user = ynVar.f43422m3;
        TLRPC.Chat chat = ynVar.f43436n3;
        if (TextUtils.isEmpty(ynVar.f43484r3) && ynVar.f43447o3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, j11, false, user, chat, z11, ynVar.f43447o3);
        AndroidUtilities.hideKeyboard(ynVar.f43359h0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z10) {
        boolean z11;
        super.h(z10);
        yn ynVar = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = ynVar.f43359h0;
        if (v0Var != null && v0Var.s() && a() && ynVar.f43498s3 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11);
    }
}
