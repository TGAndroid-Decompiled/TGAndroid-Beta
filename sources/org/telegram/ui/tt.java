package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class tt extends LinearLayout {
    public final org.telegram.ui.Components.u9 f37862a;
    public final org.telegram.ui.ActionBar.k5 f37863b;
    public final org.telegram.ui.ActionBar.f6 f37864c;
    public TLRPC.StickerSetCovered d;

    public tt(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f37864c = f6Var;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f37862a = u9Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f37863b = k5Var;
        k5Var.setTextSize(16);
        k5Var.setTextColor(-1);
        setOrientation(0);
        addView(u9Var, w7.x5.t(24, 24, 17, 17, 0, 17, 0));
        addView(k5Var, w7.x5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
