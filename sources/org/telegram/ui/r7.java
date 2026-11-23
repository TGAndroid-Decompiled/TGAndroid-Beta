package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class r7 extends FrameLayout {
    public final org.telegram.ui.Components.ek0 f51475a;

    public r7(Context context, org.telegram.ui.Components.ek0 ek0Var) {
        super(context);
        this.f51475a = ek0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ek0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
