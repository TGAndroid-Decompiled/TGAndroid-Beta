package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class t7 extends FrameLayout {
    public final org.telegram.ui.Components.tj0 f49722a;

    public t7(Context context, org.telegram.ui.Components.tj0 tj0Var) {
        super(context);
        this.f49722a = tj0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(tj0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
