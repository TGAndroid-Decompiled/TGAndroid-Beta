package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class rt extends LinearLayout {
    public final org.telegram.ui.Components.v9 f37244a;
    public final org.telegram.ui.ActionBar.j5 f37245b;
    public final org.telegram.ui.ActionBar.f6 f37246c;
    public TLRPC.StickerSetCovered d;

    public rt(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f37246c = f6Var;
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.f37244a = v9Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f37245b = j5Var;
        j5Var.setTextSize(16);
        j5Var.setTextColor(-1);
        setOrientation(0);
        addView(v9Var, w7.y5.t(24, 24, 17, 17, 0, 17, 0));
        addView(j5Var, w7.y5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
