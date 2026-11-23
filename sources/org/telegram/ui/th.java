package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class th extends ff0 {
    public final bn f52406f;

    public th(bn bnVar, Context context, int i7, org.telegram.messenger.fj fjVar) {
        super(context);
        this.f52406f = bnVar;
        this.f47824a = null;
        if (!fjVar.h4()) {
            fjVar.P4();
        }
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.f47826c = vzVar;
        vzVar.e(org.telegram.ui.ActionBar.n6.G8, org.telegram.ui.ActionBar.n6.f29543i6, -1);
        vzVar.setViewType(13);
        vzVar.setIsSingleCell(false);
        addView(vzVar, c8.na.c(-1.0f, -2));
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, null);
        this.f47825b = j80Var;
        j80Var.setTextSize(1, 14.0f);
        j80Var.setGravity(19);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.E8, null);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, null);
        j80Var.setEllipsize(TextUtils.TruncateAt.END);
        j80Var.setSingleLine();
        j80Var.setLines(1);
        j80Var.setMaxLines(1);
        addView(j80Var, c8.na.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = org.telegram.messenger.mp.u1(i7).j1(-org.telegram.messenger.fj.B0(fjVar.f24073k));
        tL_channels_getMessageAuthor.f28529id = fjVar.e1();
        j80Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i7).sendRequest(tL_channels_getMessageAuthor, new di.w1(this, i7, 9));
        setBackground(org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I5, false), 6, 0));
        setEnabled(false);
    }
}
