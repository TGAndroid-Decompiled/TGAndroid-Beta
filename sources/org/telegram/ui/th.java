package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class th extends gf0 {
    public final bn f52331f;

    public th(bn bnVar, Context context, int i7, org.telegram.messenger.fj fjVar) {
        super(context);
        this.f52331f = bnVar;
        this.f48102a = null;
        if (!fjVar.h4()) {
            fjVar.P4();
        }
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.f48104c = yzVar;
        yzVar.e(org.telegram.ui.ActionBar.m6.G8, org.telegram.ui.ActionBar.m6.f29470i6, -1);
        yzVar.setViewType(13);
        yzVar.setIsSingleCell(false);
        addView(yzVar, c8.ma.c(-1.0f, -2));
        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(context, null);
        this.f48103b = m80Var;
        m80Var.setTextSize(1, 14.0f);
        m80Var.setGravity(19);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.E8, null);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, null);
        m80Var.setEllipsize(TextUtils.TruncateAt.END);
        m80Var.setSingleLine();
        m80Var.setLines(1);
        m80Var.setMaxLines(1);
        addView(m80Var, c8.ma.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = org.telegram.messenger.mp.u1(i7).j1(-org.telegram.messenger.fj.B0(fjVar.f23993k));
        tL_channels_getMessageAuthor.f28468id = fjVar.e1();
        m80Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i7).sendRequest(tL_channels_getMessageAuthor, new di.w1(this, i7, 9));
        setBackground(org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false), 6, 0));
        setEnabled(false);
    }
}
