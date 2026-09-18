package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class rt extends LinearLayout {
    public final org.telegram.ui.Components.w9 f37127a;
    public final org.telegram.ui.ActionBar.j5 f37128b;
    public final org.telegram.ui.ActionBar.e6 f37129c;
    public TLRPC.StickerSetCovered d;

    public rt(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f37129c = e6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f37127a = w9Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f37128b = j5Var;
        j5Var.setTextSize(16);
        j5Var.setTextColor(-1);
        setOrientation(0);
        addView(w9Var, w7.y5.t(24, 24, 17, 17, 0, 17, 0));
        addView(j5Var, w7.y5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
