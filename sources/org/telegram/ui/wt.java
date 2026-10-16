package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class wt extends LinearLayout {
    public final org.telegram.ui.Components.z9 f41356a;
    public final org.telegram.ui.ActionBar.h5 f41357b;
    public final org.telegram.ui.ActionBar.c6 f41358c;
    public TLRPC.StickerSetCovered d;

    public wt(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f41358c = c6Var;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f41356a = z9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f41357b = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(-1);
        setOrientation(0);
        addView(z9Var, w7.z5.t(24, 24, 17, 17, 0, 17, 0));
        addView(h5Var, w7.z5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
