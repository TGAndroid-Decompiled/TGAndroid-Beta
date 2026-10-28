package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final org.telegram.ui.Components.nm0 f44531a;

    public w7(Context context, org.telegram.ui.Components.nm0 nm0Var) {
        super(context);
        this.f44531a = nm0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(nm0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
