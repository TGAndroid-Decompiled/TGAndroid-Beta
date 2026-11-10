package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class vh extends gf0 {
    public final cn f50726f;

    public vh(cn cnVar, Context context, int i7, org.telegram.messenger.ij ijVar) {
        super(context);
        this.f50726f = cnVar;
        this.f46086a = null;
        if (!ijVar.h4()) {
            ijVar.P4();
        }
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        this.f46088c = lzVar;
        lzVar.e(org.telegram.ui.ActionBar.m6.G8, org.telegram.ui.ActionBar.m6.f27982i6, -1);
        lzVar.setViewType(13);
        lzVar.setIsSingleCell(false);
        addView(lzVar, c8.ha.c(-1.0f, -2));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, null);
        this.f46087b = w70Var;
        w70Var.setTextSize(1, 14.0f);
        w70Var.setGravity(19);
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.E8, null);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, null);
        w70Var.setEllipsize(TextUtils.TruncateAt.END);
        w70Var.setSingleLine();
        w70Var.setLines(1);
        w70Var.setMaxLines(1);
        addView(w70Var, c8.ha.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = org.telegram.messenger.qp.s1(i7).h1(-org.telegram.messenger.ij.B0(ijVar.f23266k));
        tL_channels_getMessageAuthor.f26997id = ijVar.e1();
        w70Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i7).sendRequest(tL_channels_getMessageAuthor, new bi.j2(this, i7, 9));
        setBackground(org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false), 6, 0));
        setEnabled(false);
    }
}
