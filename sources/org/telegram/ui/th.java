package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class th extends df0 {
    public final an f50055f;

    public th(an anVar, Context context, int i7, org.telegram.messenger.ij ijVar) {
        super(context);
        this.f50055f = anVar;
        this.f45054a = null;
        if (!ijVar.i4()) {
            ijVar.Q4();
        }
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f45056c = mzVar;
        mzVar.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f27944i6, -1);
        mzVar.setViewType(13);
        mzVar.setIsSingleCell(false);
        addView(mzVar, c8.ha.c(-1.0f, -2));
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, null);
        this.f45055b = w70Var;
        w70Var.setTextSize(1, 14.0f);
        w70Var.setGravity(19);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.E8, null);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, null);
        w70Var.setEllipsize(TextUtils.TruncateAt.END);
        w70Var.setSingleLine();
        w70Var.setLines(1);
        w70Var.setMaxLines(1);
        addView(w70Var, c8.ha.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = org.telegram.messenger.qp.s1(i7).h1(-org.telegram.messenger.ij.B0(ijVar.f23262k));
        tL_channels_getMessageAuthor.f26993id = ijVar.f1();
        w70Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i7).sendRequest(tL_channels_getMessageAuthor, new bi.j2(this, i7, 9));
        setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false), 6, 0));
        setEnabled(false);
    }
}
