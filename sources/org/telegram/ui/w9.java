package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class w9 extends EditTextBoldCursor {
    public final int H1;
    public final x9 I1;

    public w9(x9 x9Var, Context context, int i3) {
        super(context);
        this.H1 = i3;
        this.I1 = x9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        switch (this.H1) {
            case 0:
                return this.I1.d;
            default:
                return this.I1.d;
        }
    }
}
