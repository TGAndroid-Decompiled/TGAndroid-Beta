package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class s7 extends FrameLayout {
    public final org.telegram.ui.Components.pj0 f49665a;

    public s7(Context context, org.telegram.ui.Components.pj0 pj0Var) {
        super(context);
        this.f49665a = pj0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(pj0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
