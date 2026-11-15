package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class th extends df0 {
    public final an f51587f;

    public th(an anVar, Context context, int i7, org.telegram.messenger.gj gjVar) {
        super(context);
        this.f51587f = anVar;
        this.f46360a = null;
        if (!gjVar.h4()) {
            gjVar.P4();
        }
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.f46362c = pzVar;
        pzVar.e(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f28941i6, -1);
        pzVar.setViewType(13);
        pzVar.setIsSingleCell(false);
        addView(pzVar, c8.ja.c(-1.0f, -2));
        org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context, null);
        this.f46361b = z70Var;
        z70Var.setTextSize(1, 14.0f);
        z70Var.setGravity(19);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.E8, null);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, null);
        z70Var.setEllipsize(TextUtils.TruncateAt.END);
        z70Var.setSingleLine();
        z70Var.setLines(1);
        z70Var.setMaxLines(1);
        addView(z70Var, c8.ja.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = org.telegram.messenger.np.s1(i7).h1(-org.telegram.messenger.gj.B0(gjVar.f23819k));
        tL_channels_getMessageAuthor.f28088id = gjVar.e1();
        z70Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i7).sendRequest(tL_channels_getMessageAuthor, new di.u1(this, i7, 9));
        setBackground(org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.I5, false), 6, 0));
        setEnabled(false);
    }
}
