package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class rt extends LinearLayout {
    public final org.telegram.ui.Components.x9 f40232a;
    public final org.telegram.ui.ActionBar.j5 f40233b;
    public final org.telegram.ui.ActionBar.f6 f40234c;
    public TLRPC.StickerSetCovered d;

    public rt(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f40234c = f6Var;
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f40232a = x9Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f40233b = j5Var;
        j5Var.setTextSize(16);
        j5Var.setTextColor(-1);
        setOrientation(0);
        addView(x9Var, w7.x5.t(24, 24, 17, 17, 0, 17, 0));
        addView(j5Var, w7.x5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
