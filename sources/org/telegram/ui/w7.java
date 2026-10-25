package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final org.telegram.ui.Components.mm0 f44989a;

    public w7(Context context, org.telegram.ui.Components.mm0 mm0Var) {
        super(context);
        this.f44989a = mm0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(mm0Var, new FrameLayout.LayoutParams(-1, -1));
    }
}
