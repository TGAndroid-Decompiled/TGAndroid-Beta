package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class sh extends gf0 {
    public final bn f51996f;

    public sh(bn bnVar, Context context, int i7, org.telegram.messenger.fj fjVar) {
        super(context);
        this.f51996f = bnVar;
        this.f48095a = null;
        if (!fjVar.h4()) {
            fjVar.P4();
        }
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
        this.f48097c = wzVar;
        wzVar.e(org.telegram.ui.ActionBar.n6.G8, org.telegram.ui.ActionBar.n6.f29488i6, -1);
        wzVar.setViewType(13);
        wzVar.setIsSingleCell(false);
        addView(wzVar, c8.ma.c(-1.0f, -2));
        org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(context, null);
        this.f48096b = k80Var;
        k80Var.setTextSize(1, 14.0f);
        k80Var.setGravity(19);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.E8, null);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, null);
        k80Var.setEllipsize(TextUtils.TruncateAt.END);
        k80Var.setSingleLine();
        k80Var.setLines(1);
        k80Var.setMaxLines(1);
        addView(k80Var, c8.ma.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = org.telegram.messenger.mp.u1(i7).j1(-org.telegram.messenger.fj.B0(fjVar.f23968k));
        tL_channels_getMessageAuthor.f28442id = fjVar.e1();
        k80Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i7).sendRequest(tL_channels_getMessageAuthor, new di.w1(this, i7, 9));
        setBackground(org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I5, false), 6, 0));
        setEnabled(false);
    }
}
