package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class s7 extends FrameLayout {
    public final org.telegram.ui.Components.tk0 f41396a;

    public s7(Context context, org.telegram.ui.Components.tk0 tk0Var) {
        super(context);
        this.f41396a = tk0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(tk0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
