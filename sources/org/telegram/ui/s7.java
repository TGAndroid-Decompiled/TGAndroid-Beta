package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class s7 extends FrameLayout {
    public final org.telegram.ui.Components.uk0 f41271a;

    public s7(Context context, org.telegram.ui.Components.uk0 uk0Var) {
        super(context);
        this.f41271a = uk0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(uk0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
