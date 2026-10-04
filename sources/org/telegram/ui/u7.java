package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class u7 extends FrameLayout {
    public final org.telegram.ui.Components.zl0 f41080a;

    public u7(Context context, org.telegram.ui.Components.zl0 zl0Var) {
        super(context);
        this.f41080a = zl0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(zl0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
