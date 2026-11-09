package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class s7 extends FrameLayout {
    public final org.telegram.ui.Components.qj0 f49787a;

    public s7(Context context, org.telegram.ui.Components.qj0 qj0Var) {
        super(context);
        this.f49787a = qj0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(qj0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
