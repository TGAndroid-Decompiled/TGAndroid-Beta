package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class vh extends ff0 {
    public final cn f50688f;

    public vh(cn cnVar, Context context, int i7, org.telegram.messenger.ij ijVar) {
        super(context);
        this.f50688f = cnVar;
        this.f45704a = null;
        if (!ijVar.h4()) {
            ijVar.P4();
        }
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f45706c = mzVar;
        mzVar.e(org.telegram.ui.ActionBar.l6.G8, org.telegram.ui.ActionBar.l6.f27957i6, -1);
        mzVar.setViewType(13);
        mzVar.setIsSingleCell(false);
        addView(mzVar, c8.ha.c(-1.0f, -2));
        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(context, null);
        this.f45705b = x70Var;
        x70Var.setTextSize(1, 14.0f);
        x70Var.setGravity(19);
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.E8, null);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.Uc, null);
        x70Var.setEllipsize(TextUtils.TruncateAt.END);
        x70Var.setSingleLine();
        x70Var.setLines(1);
        x70Var.setMaxLines(1);
        addView(x70Var, c8.ha.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = org.telegram.messenger.qp.s1(i7).h1(-org.telegram.messenger.ij.B0(ijVar.f23262k));
        tL_channels_getMessageAuthor.f26993id = ijVar.e1();
        x70Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i7).sendRequest(tL_channels_getMessageAuthor, new bi.j2(this, i7, 9));
        setBackground(org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.I5, false), 6, 0));
        setEnabled(false);
    }
}
