package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class tt extends LinearLayout {
    public final org.telegram.ui.Components.y9 f42287a;
    public final org.telegram.ui.ActionBar.h5 f42288b;
    public final org.telegram.ui.ActionBar.c6 f42289c;
    public TLRPC.StickerSetCovered d;

    public tt(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f42289c = c6Var;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f42287a = y9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f42288b = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(-1);
        setOrientation(0);
        addView(y9Var, w7.w5.t(24, 24, 17, 17, 0, 17, 0));
        addView(h5Var, w7.w5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
