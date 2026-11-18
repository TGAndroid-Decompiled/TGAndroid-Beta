package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class r7 extends FrameLayout {
    public final org.telegram.ui.Components.ck0 f51519a;

    public r7(Context context, org.telegram.ui.Components.ck0 ck0Var) {
        super(context);
        this.f51519a = ck0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ck0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
