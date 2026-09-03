package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class xk extends org.telegram.ui.Components.nn0 {
    public final zn F;

    public xk(zn znVar, Context context, zn znVar2, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j10, context, znVar2, f6Var);
        this.F = znVar;
    }

    @Override
    public final void b(boolean z4) {
        zn znVar = this.F;
        znVar.t7();
        znVar.r7();
        cl clVar = znVar.Ya;
        if (clVar != null) {
            clVar.setTranslationY(znVar.t9 + getCurrentHeight());
        }
        if (z4) {
            znVar.A9 = true;
            znVar.jc();
        }
    }

    @Override
    public final boolean f(mg.q0 q0Var) {
        boolean z4;
        int i10;
        boolean z10;
        zn znVar = this.F;
        znVar.f40677n3 = q0Var;
        if (q0Var != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        znVar.f40689o3 = z4;
        if (q0Var == null) {
            znVar.getMediaDataController().clearFoundMessageObjects();
            znVar.kb(false);
            znVar.Fc(0, 0, -1);
        }
        znVar.Ic();
        znVar.vc();
        znVar.f40714q3 = znVar.f40588g0.getSearchField().getText().toString();
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str = znVar.f40714q3;
        long j10 = znVar.Q5;
        long j11 = znVar.I6;
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
        long j12 = znVar.f40514a4;
        TLRPC.User user = znVar.f40652l3;
        TLRPC.Chat chat = znVar.f40664m3;
        if (TextUtils.isEmpty(znVar.f40714q3) && znVar.f40677n3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, j12, false, user, chat, z10, znVar.f40677n3);
        AndroidUtilities.hideKeyboard(znVar.f40588g0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z4) {
        boolean z10;
        super.h(z4);
        zn znVar = this.F;
        org.telegram.ui.ActionBar.w0 w0Var = znVar.f40588g0;
        if (w0Var != null && w0Var.s() && a() && znVar.f40727r3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
    }
}
