package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class st extends LinearLayout {
    public final org.telegram.ui.Components.w9 f36750a;
    public final org.telegram.ui.ActionBar.l5 f36751b;
    public final org.telegram.ui.ActionBar.f6 f36752c;
    public TLRPC.StickerSetCovered d;

    public st(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f36752c = f6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f36750a = w9Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f36751b = l5Var;
        l5Var.setTextSize(16);
        l5Var.setTextColor(-1);
        setOrientation(0);
        addView(w9Var, w7.a6.t(24, 24, 17, 17, 0, 17, 0));
        addView(l5Var, w7.a6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
