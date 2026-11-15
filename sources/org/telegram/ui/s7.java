package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class s7 extends FrameLayout {
    public final org.telegram.ui.Components.uj0 f51134a;

    public s7(Context context, org.telegram.ui.Components.uj0 uj0Var) {
        super(context);
        this.f51134a = uj0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(uj0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
